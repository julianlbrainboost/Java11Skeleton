import java.util.Scanner;

class RunofIntegers {
     public static void main(String[] args){
         
         int start, end, count;
         
         Scanner scan = new Scanner(System.in);
         
         //Inputs starting number
         System.out.println("Enter start: ");
         start = scan.nextInt();
         
         //Inputs ending number
         System.out.println("Enter end: ");
         end = scan.nextInt();

         count = start;
         
         //This code counts or whatever
         while (count <= end) {
             System.out.println(count);
             count = count + 1;
            }
        }
    }