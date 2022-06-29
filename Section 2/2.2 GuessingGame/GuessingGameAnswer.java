package challenge;
import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your guess:\n");
        int attempt = scan.nextInt();
        guesser(attempt);
        System.out.println("Enter another guess:\n");
        int attemptTwo = scan.nextInt();
        guesser(attemptTwo);
        System.out.println("Enter another guess:\n");
        int attemptThree = scan.nextInt();
        guesser(attemptThree);

    }
    public static void guesser(int guess){
        double target = Math.random() * 100;
        if(guess > target){
            System.out.println("You Won! My number was " + target);
        }else{
            System.out.println("You Lose! My number was " + target);
        }
    }
}