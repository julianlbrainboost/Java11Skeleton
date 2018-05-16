import java.util.Scanner;

class BrickDrop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double g = 32.174;
        double d, t;
        
        System.out.println("Enter amount of seconds");
        t = sc.nextDouble();
        
        d = t * t * g * (1.0/2.0);
        
        
        System.out.println("your brick fell: " + d + " ft");
    }
}