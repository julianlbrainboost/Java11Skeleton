import java.util.Scanner;

class WordEcho {
     public static void main(String[] args){
         
        Scanner scan = new Scanner(System.in);
         
        int count, times;
        String inputString;

        //Inputs word here
        System.out.println("Enter word:");
        inputString = scan.nextLine();

        //Reads length of word
        times = inputString.length();

        count = 1;
        
        //counts and prints
        while (count<=times) {
            System.out.println(inputString);
            count = count + 1;
        }
    }
}     