import java.util.Scanner;
public class TriviaAnswer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int totalQuestions = 5;
        String welcome = "Welcome to Trivia!\nPlease answer each question with a lowercase letter";

        System.out.print(welcome);

        System.out.print("1. Who is the Alumni Technical Instructor at Coding Temple?\n");
        System.out.print("a) Nate\nb) Nicole\nc) Brian\n");
        String ans = scan.nextLine();
        if(ans.equals("a")){
            count++;
        }
        System.out.print("2. Who is the Curriculum Director at Coding Temple?\n");
        System.out.print("\na) Nate\nb) Joel\nc) Derek\nd) Tatyana\n");
        String ansTwo = scan.nextLine();
        if(ansTwo.equals("b")){
            count++;
        }
        System.out.print("3. What language are you learning in this video?\n");
        System.out.print("\na) Java\nb) JavaScript\nc) Python\nd) C\n");
        String ansThree = scan.nextLine();
        if(ansThree.equals("a")){
            count++;
        }

        if(count == 3){
            System.out.println("Great Job! You got " + count + "/3 Correct!");
        }else if(count == 2 || count == 1){
            System.out.println("Better Luck next time! You got " + count + "/3 Correct!");
        }else{
            System.out.println("0%! F for you!");
        }
        scan.close();

    }
}
