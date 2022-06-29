import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanAnswer{
    public static void main(String[] args) {
        hangMan();
    }
    public static void hangMan(){
        ArrayList<Character> word = new ArrayList<Character>(Arrays.asList('c','o','d', 'e'));
        ArrayList<Character> userGuess = new ArrayList<Character>(Arrays.asList('_','_','_', '_'));
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hang Man! You have 7 guesses to get the word correct!");
        int remaining = 7;
        int correctCount = 0;
        while(remaining > 0 && correctCount < userGuess.size()){
            System.out.println("\nYou have "+ remaining + " guesses left!");
            System.out.println("Enter your guess:");
            char guess = scan.next().charAt(0);
            for(int i = 0; i<word.size(); i++){
                if(word.get(i) == guess){
                    if(userGuess.get(i) != guess){
                        userGuess.set(i, guess);
                        correctCount++;
                    }else{
                        System.out.println("You already guessed that!");
                    }
                    
                }
            }
            System.out.println(userGuess);
            remaining --;
        }
        if(correctCount == userGuess.size()){
            System.out.println("Congrats, You won!");
        }else{
            System.out.println("Sorry, You lost! The word was: " + word);
        }
    }
}