import java.util.Scanner;

class IncomeCalc {
    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        double wage, hours, income, tax, total;
        
        System.out.println("enter hourly pay");
        wage = scan.nextDouble();
        
        System.out.println("enter hours worked");
        hours = scan.nextDouble();
        
        income = wage * hours;
        tax = income * 0.3;
        total = income - tax;
        
        System.out.println("Income:......" + income);
        System.out.println("Tax:........." + tax);
        System.out.println("Total:......." + total);
    }
}