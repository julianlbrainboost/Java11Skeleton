import java.util.Scanner;

class TirePressure1 {
     public static void main(String[] args){
         
         int rightFront, leftFront, rightRear, leftRear;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Input right front tire pressure");
         rightFront = scan.nextInt();
         
         System.out.println("Input left front tire pressure");
         leftFront = scan.nextInt();
         
         System.out.println("Input right rear tire pressure");
         rightRear = scan.nextInt();
         
         System.out.println("Input left rear tire pressure");
         leftRear = scan.nextInt();
         
         if (rightFront != leftFront || rightRear != leftRear) {
            System.out.println("You might want to get your tires pumped");
        } else {
            System.out.println("Good to go!");
        }
    }
}
           
