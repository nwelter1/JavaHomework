import java.util.Scanner;

public class DeliAnswer {
    public static void main(String[] args) {
        // Welcome to the deli! today you will be serving a customer
        // coffees and breakfast sandwiches. Coffee is $2.99 and sandwiches
        // are $4.
        // You should ask a customer what quantity of coffee and sandwiches
        // they want. You will then present them with their total and collect 
        // their payment. After they pay, you will present them with their change
        // You can assume we do not need to do any conditional checks (ie. it is fine if there is negative change!)
        int counter = 1;
        int sandwichPrice = 4;
        double coffeePrice = 2.99;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Deli customer" + counter + "!\nCoffee is $2.99 and sandwiches are $4.00.\n How many coffees would you like?");
        int coffeeQty = scan.nextInt();

        System.out.println("Great! " + coffeeQty + " coffees it is!\nHow many sandwiches would you like?");
        int sandwichQty = scan.nextInt();

        double total = (coffeePrice*coffeeQty) + (sandwichPrice*sandwichQty);
        System.out.println("Cool. Your total is $" + total + "\nPlease enter your payment below and we will give your change:" );
        double payment = scan.nextDouble();
        
        System.out.println("Your change is $" + (payment-total) + ". Thanks for stopping in!");
        scan.close();
    }
}
