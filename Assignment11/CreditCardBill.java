import java.util.Scanner;

class CreditCardBill {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double balance = 1000;
        double payment;
        int month = 1;
        
        System.out.println("Enter payment per 1 month");
        payment = scan.nextDouble();
        
        while (balance > 0) { //Loop
            balance -= payment;
            balance = balance * 1.015;
            System.out.println("amount of months: ....." + month);
            System.out.println("balance: .............." + balance);
            System.out.println("payment: .............." + payment);
            month ++;
        }
    }
}