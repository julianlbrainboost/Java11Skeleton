import java.util.Scanner;

class ShippingCalc {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int weight; 
        double shippingCost = 0;
        
        weight = scan.nextInt();
        
           while (!(weight == 0)) { //code repeats until 0 is inputed
           shippingCost = 0;
           if (weight > 10) {
              shippingCost = 0.25 * (weight - 10);
           }
           shippingCost += 3;
           System.out.println("Enter weight of order");
           weight = scan.nextInt();
           System.out.println("Shipping Cost: " + shippingCost);
        }
    }
}