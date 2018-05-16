import java.util.Scanner;

class TirePressure2 {
     public static void main(String[] args){
         
         int rightFront, leftFront, rightRear, leftRear;
         boolean goodPressure = true;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Input right front tire pressure");
         rightFront = scan.nextInt();
         if (rightFront > 45 || rightFront < 35) {
             goodPressure = false;
             System.out.println("Warning! pressure out of range");
            }
            
         System.out.println("Input left front tire pressure");
         leftFront = scan.nextInt();
         if (leftFront > 45 || rightFront < 35) {
             goodPressure = false;
             System.out.println("Warning! pressure out of range");
            }
         
         System.out.println("Input right rear tire pressure");
         rightRear = scan.nextInt();
         if (rightRear > 45 || rightFront < 35) {
             goodPressure = false;
             System.out.println("Warning! pressure out of range");
            }
         
         System.out.println("Input left rear tire pressure");
         leftRear = scan.nextInt();
         if (leftRear > 45 || rightFront < 35) {
             goodPressure = false;
             System.out.println("Warning! pressure out of range");
            }
         
         if (rightFront != leftFront || rightRear != leftRear) {
            System.out.println("You might want to get your tires pumped");
            
         } else {
            System.out.println("Possibly good to go!");
         }
    }
}