import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> empty=new ArrayList<>();
    public static void main(String[] args){

   while(true) {
       wordProcessing(GuessWord());
   }

    }

    public static String GuessWord(){
        System.out.println("Welcome, let's play hangman!");
        String[] arr={"tree","rain","bear","encourage","promise","soup","chess","insurance", "pancakes", "stream"};
        Random r=new Random();
        int random=r.nextInt(10);
        String guessWord=arr[random];
        System.out.print("Here is the word I am thinking of: ");
        return guessWord;
    }
    public static void wordProcessing(String input){
        Scanner key=new Scanner(System.in);
        String[] guessword=input.split("");

        System.out.print(input);
        for (String x:empty) {

                System.out.print(x+" ");

        }


        System.out.println("Enter letter or word guess:");
        String answer=key.next();
        String[] yourguess=answer.split("");
        for (String x:yourguess) {
            if (input.contains(x)) {
                empty.set(input.indexOf(x))= x;
            }
        }
        System.out.print("Your guess so far:");
        for (String y:empty) {
          System.out.println(y+" ");
        }
    }
}
