import java.util.Scanner;

class NumberSquarer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = 0;
        
        do {
            System.out.println("Enter a number to square. Enter '0' to exit");
            x = scan.nextInt();
            
            scan.nextLine();
            
            System.out.println((x * x));
        } while (x != 0);
    }
}