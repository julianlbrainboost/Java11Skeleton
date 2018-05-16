import java.util.Scanner ;
class DiscountPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double purchase;
        double discount = 10;
        
        System.out.println("Enter price");
        purchase = sc.nextDouble();
        
        if (purchase > discount) {
            purchase = purchase * 0.9;
            System.out.println(purchase + " is the total price");
                   } else {
            System.out.println(purchase + " is the total price");
        }
    }
}