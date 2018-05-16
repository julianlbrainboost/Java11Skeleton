import java.util.Scanner;
import java.util.Random;

class RandomGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();

        int num, guess, plus, minus;

        num = generaterandom.nextInt(100) + 1;
        
        System.out.println("Guess a number from 1-100:");
        guess = scan.nextInt();
        
        if (num == guess) {
       System.out.println("You guessed a thing!");
       } else {
       System.out.println("You were off by " + (num - guess));
     }
  }
}