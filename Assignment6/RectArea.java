import java.util.Scanner;
class RectArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long width, height, area;

        System.out.println("Enter an width:");
        width = scan.nextInt();

        System.out.println("Enter an height:");
        height = scan.nextInt();
        
        area = width * height;

        System.out.println ( "The rectangle area is " + area);
    }
}