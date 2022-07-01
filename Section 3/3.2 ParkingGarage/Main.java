import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        runGarage();
    }
    public static void runGarage(){
        Scanner scan = new Scanner(System.in);
        Garage g = new Garage();
        boolean running = true;
        System.out.println("Welcome to the Garage!");
        while(running){
            System.out.println("What would you like to do? (park/pay/exit)");
            String ans = scan.nextLine();
            switch(ans){
                case "park": 
                    g.park();
                    System.out.println("Current Status");
                    System.out.println("Available Spaces:");
                    System.out.println(g.getTickets());
                    System.out.println("Taken Spaces:");
                    System.out.println(g.getCurrentSpaces());
                    break;
                case "pay":
                    System.out.println("What is your ticket number?");
                    int number = Integer.parseInt(scan.nextLine());
                    g.pay(number);
                    System.out.println("Current Status");
                    System.out.println("Available Spaces:");
                    System.out.println(g.getTickets());
                    System.out.println("Taken Spaces:");
                    System.out.println(g.getCurrentSpaces());
                    break;
                case "exit":
                    System.out.println("What is your ticket number?");
                    int ticketNumber = scan.nextInt();
                    g.exit(ticketNumber);
                    System.out.println("Current Status");
                    System.out.println("Available Spaces:");
                    System.out.println(g.getTickets());
                    System.out.println("Taken Spaces:");
                    System.out.println(g.getCurrentSpaces());
                    break;
                case "q":
                    running = false;break;

            }
        }
    }
}