import java.util.Scanner;
class Question2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long width, height, area, cost;

        System.out.println("Enter an width:");
        width = scan.nextInt();

        System.out.println("Enter an height:");
        height = scan.nextInt();
        
        System.out.println("Enter an price per square area:");
        cost = scan.nextInt();
        
        area = width * height;

        System.out.println ( "The cast to paint is " + area * cost);
    }
}