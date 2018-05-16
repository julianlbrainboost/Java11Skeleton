import java.util.Scanner;

class Cents {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double cents, dollars;
        
        System.out.println("Enter amount of cents");
        cents = scan.nextDouble();
        
        dollars = cents / 100;
        
        System.out.println("You have $" + dollars + " in dollars");
    }
}