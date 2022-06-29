import java.util.HashMap;
import java.util.Scanner;


public class ShoppingCartAnswer{
    public static void main(String[] args) {
        cart();
    }
    public static void cart(){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> shoppingCart = new HashMap<String, Integer>();
        System.out.println("Welcome to the Grocery Store!");
        boolean shopping = true;
        while(shopping){
            System.out.println("What would you like to do? (add/remove/show/checkout)");
            String input = scan.nextLine();
            switch(input){
                case "add":
                    System.out.println("What would you like to add?");
                    String addItem = scan.nextLine();
                    if(shoppingCart.containsKey(addItem)){
                        int qty = shoppingCart.get(addItem);
                        shoppingCart.put(addItem, qty + 1);
                    }else{
                        shoppingCart.put(addItem, 1);
                    }
                    System.out.println(shoppingCart);break;
                case "remove":
                    System.out.println("What would you like to remove?");
                    String remItem = scan.nextLine();
                    if(shoppingCart.containsKey(remItem)){
                        int qty = shoppingCart.get(remItem);
                        if(qty == 1){
                            shoppingCart.remove(remItem);
                        }else{
                            shoppingCart.put(remItem, qty - 1);
                        }
                    }else{
                        System.out.println("That item is not in your cart!");
                    }; break;
                case "show":
                    System.out.println("Here's your cart!");
                    System.out.println(shoppingCart); break;
                
                case "checkout":
                    System.out.println("Thank you for shopping, here is your receipt!");
                    System.out.println("Item     Qty");
                    for(String item: shoppingCart.keySet()){
                        System.out.println(item + "    " + shoppingCart.get(item));
                    }
                    shopping = false;
                    


            }
            
        }
        scan.close();

    }
}