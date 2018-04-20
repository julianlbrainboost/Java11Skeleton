import java.util.Scanner;

class RectangleArea {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            int x1, x2, y1, y2, width, height, area;
            
            System.out.println("Enter First corner X coordinate: ");
            x1 = scan.nextInt();
        
            System.out.println("Enter First corner Y coordinate: ");
            y1 = scan.nextInt();
        
            System.out.println("Enter Second corner X coordinate: ");
            x2 = scan.nextInt();
        
            System.out.println("Enter Second corner Y coordinate: ");
            y2 = scan.nextInt();
        
            if (x1 > x2) {
                width = x1 - x2;
            } else if (x2 > x1) {
                width = x2 - x1 ;
            } else {
                System.out.println("Not valid!");
                break; // ends code
            }
            if (y1 > y2) {
                height = x1 - y2;
            } else if (y2 > y1) {
                height = y2 - y1 ;
            } else {
                System.out.println("Not valid!");
                break;
            }
            System.out.println("Width: " + width + " Height: " + height);
        }
    }
}       