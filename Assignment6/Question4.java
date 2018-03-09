import java.util.Scanner;
class Question4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long price, quantity, total;

        System.out.println("Enter an ticket quantity:");
        quantity = scan.nextInt();
        
        System.out.println("Enter price of a ticket:");
        price = scan.nextInt();
        
        total = price * quantity;

        System.out.println ( quantity + "tickets costs" + total );
    }
}
