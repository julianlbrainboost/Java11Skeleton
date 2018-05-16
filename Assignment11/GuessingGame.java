import java.util.Scanner;

class GuessingGame {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int guesses = 0;
        int number = (int)(Math.random() * 10) + 1;
        
        while (guesses < 3) {
            System.out.println("Guess a number between 1 and 10: ");
            int guess = scan.nextInt();
            
            if (guess == number) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect!");
                guesses++;
            }
        }
        System.out.println("-END GAME-");
       }
    }