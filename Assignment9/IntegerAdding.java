import java.util.Scanner;

class IntegerAdding {
     public static void main(String[] args){
         
        Scanner scan = new Scanner(System.in);

        int number, sum, input, count;
        
        //Input number of integers to be added
        System.out.println("How many integers will be added?");
        number = scan.nextInt();

        sum = 0;
        count = 0;

        //This code does al the math
        while (count < number) {

            System.out.println ( "Enter an integer:" );

            input = scan.nextInt ();

            sum = sum + input;

            count++;
        }

        System.out.println ( "The sum is " + sum + ".");
    }
}