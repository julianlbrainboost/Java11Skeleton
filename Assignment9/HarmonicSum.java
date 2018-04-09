import java.util.Scanner;

class HarmonicSum {
     public static void main(String[] args){
         
         Scanner scan = new Scanner(System.in);
         
         int number, count = 1;
         double sum = 0;
         
         //Inputs number here
         System.out.println("Enter number");
         number = scan.nextInt();
         
         //This code does maths
         while (count <= number ) {
             
             sum = sum + 1.0/count;
             count++;
            }
         System.out.println("Sum is: " + sum);
        }
    }
