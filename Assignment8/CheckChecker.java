import java.util.Scanner;

class CheckChecker {
     public static void main(String[] args){
        
       double savings, checking;
      
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter amount of money in your savings account:");
       savings = scan.nextDouble();
       
       System.out.println("Enter amount of money in your checking account:");
       checking = scan.nextDouble();
       
       if (savings < 1500 || checking < 1000) {
          System.out.println("You're pretty poor are you sure you want to be writing checks for anyone?");
          System.out.println("Also, that'll be $0.15");
        } else {
          System.out.println("Enjoy writing checks for free!");
        }
    }
}
          
       