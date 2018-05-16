import java.util.Scanner;
import java.util.Random;

class TestYourLuck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();
        
        int correctGuesses = 0;
        
     for ( int i = 0; i < 10; i++) {
           int num = generaterandom.nextInt(100) + 1;
        
        System.out.println("Enter '1' for 1-50");
        System.out.println("Enter '2' for 51-100");
        int guess = scan.nextInt(); 
       
        if ((num < 50 && guess ==1) || (num <= 50 && guess == 1)) {
            correctGuesses++;
        }
     }
   
     if (correctGuesses > 6) {
        System.out.println("Lucky");
     } else {
        System.out.println("Unlucky");
     }
  }
}