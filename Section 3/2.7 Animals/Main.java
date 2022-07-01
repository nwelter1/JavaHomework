import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static ArrayList<Animal> animals = new ArrayList<Animal>();
    public static void main(String[] args) {
        animalAddition();

    }
    public static void animalAddition(){
        Scanner scan = new Scanner(System.in);
        boolean stillAdding = true;
        System.out.println("Add some animals to the barn! Hit enter to start!");
        while(stillAdding){
            String startingOff = scan.nextLine();
            System.out.println("What is the name of the animal you want to add?");
            String name = scan.nextLine();
            System.out.println("How many legs does it have?");
            String legs = scan.nextLine();
            System.out.println("How old is this animal?");
            int age = scan.nextInt();
            System.out.println("Can it fly? (true/false)");
            boolean fly = scan.nextBoolean();
            // Creating the animal
            Animal animal = new Animal(name, legs, age, fly);
            animals.add(animal);
            System.out.println("You successfully added " + animal.getName() + " to the list! If you are done, type 'q'. if not, type 'no'!");
            String input = scan.next();
            switch(input){
                case "q": stillAdding = false; break;
            }
        }
        System.out.println("Thanks for adding! here is your list of animals:");
        for(Animal a: animals){
            System.out.println("Name: " + a.getName() + "| Age: " + a.getAge() + "| Legs: " + a.getLegs() + "| Flies: " + a.getFly());
        }

    }
}