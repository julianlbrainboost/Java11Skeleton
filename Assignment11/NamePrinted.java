import java.util.Scanner;

class NamePrinted {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String yourName;
        
        System.out.println("Hello, my name is Won Flesruoyllik. Whats yours?");
        yourName = scan.nextLine();
        
        System.out.println(yourName + "? That sounds pretty stupid, but okay.");
    }
}