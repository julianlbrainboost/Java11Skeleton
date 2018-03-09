
import java.util.Scanner;
class Question5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long amount, remainder, total;

        System.out.println("Enter amount of eggs:");
        amount = scan.nextInt();
        
        total = amount / 12 ;
        remainder = amount % 12 ;
        
        System.out.println ( amount + "eggs equals" + total + "dozens, with remainder" + remainder );
    }
}