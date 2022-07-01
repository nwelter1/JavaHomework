import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Garage {
    ArrayList<Integer> tickets;
    HashMap<Integer, String> currentSpaces;

    public Garage(){
        this.tickets = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        this.currentSpaces = new HashMap<Integer, String>();
        }
        public void park(){
            if(tickets.size() > 0){
                int val = tickets.get(tickets.size()-1);
                tickets.remove(tickets.size()-1);
                currentSpaces.put(val, "unpaid");
                System.out.println("Your ticket number is " + val);
            }else{
                System.out.println("Sorry, no open spaces");
            }
        
        }
        public void pay(int ticketNumber){
            if(currentSpaces.containsKey(ticketNumber)){
                currentSpaces.put(ticketNumber, "paid");
                System.out.println("You may now exit!");
            }
        }
        public void exit(int ticketNumber){
            if(currentSpaces.containsKey(ticketNumber)){
                if(currentSpaces.get(ticketNumber) == "paid"){
                    tickets.add(ticketNumber);
                    currentSpaces.remove(ticketNumber);
                }else{
                    System.out.println("You need to pay first!");
                }
            }else{
                System.out.println("Invalid ticket number!");
            }
        }
        public ArrayList<Integer> getTickets(){
            return this.tickets;
        }
        public HashMap<Integer, String> getCurrentSpaces(){
            return this.currentSpaces;
        }
}
