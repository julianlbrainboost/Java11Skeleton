import java.util.Scanner;
import java.util.Random;

class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();

        int num, guess, plus, minus, loop = 0;
        
        do {
            
            int guesses = 0;
            num = generaterandom.nextInt(100) + 1;
            do {
        System.out.println("Guess a number from 1-100:");
        guess = scan.nextInt();
        guesses++;
        if (guess > num) {
            System.out.println("Too High");
        }
        
        if (guess < num) {
            System.out.println("Too Low");
        }
      } while (num != guess);
      System.out.println("You Guessed it in " + guesses);

      System.out.println("Too play again, enter 1");
      System.out.println("Too exit enter 0");
      loop = scan.nextInt();
      
    } while (loop != 0);
  }
}