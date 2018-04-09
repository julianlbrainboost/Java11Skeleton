import java.util.Scanner;

class WordsDots {
     public static void main(String[] args){
         
         String firstWord, secondWord;
         int firstWordLength, secondWordLength;
         int count = 0;
         
         Scanner scan = new Scanner(System.in);         
         
         //Inputs first word
         System.out.println("Enter first word: ");
         firstWord = scan.nextLine();
         firstWordLength = firstWord.length();
         
         //Inputs second word
         System.out.println("Enter second word: ");
         secondWord = scan.nextLine();
         secondWordLength = secondWord.length();
         
         System.out.print(firstWord);
         
         //this part fills in dots or something
         while (count < (30 - (firstWordLength + secondWordLength))) {
             System.out.print(".");
             count++;
            }
         System.out.print(secondWord);
        }
    }