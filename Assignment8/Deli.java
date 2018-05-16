import java.util.Scanner;

class Deli {
    public static void main(String[] args){
        String item;
        double price;
        int expressDelivery;
        double shippingCost = 0.0;
        double totalCost;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the item");
        item = scan.nextLine();
        
        System.out.println("Enter the price");
        price = scan.nextDouble();
        
        System.out.println("Enter 0 to continue, or enter 1 for express delivery");
        expressDelivery = scan.nextInt();
        
        if (price < 10) {
            shippingCost += 2.00;

        } if (expressDelivery == 1) {
            shippingCost += 3.00;
  
        }
        
        totalCost = price + shippingCost;
        
            System.out.println("Invoice:");
            System.out.println(item + "     $" + price);
            System.out.println("Delivery    $" + shippingCost);
            System.out.println("total       $" + totalCost);
    }
}