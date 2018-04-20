import java.util.Scanner;

class InrangeAdder {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int startRange, endRange, input;
        int sumInside = 0, sumOutside = 0;
        
        System.out.println("Enter the starting range");
        startRange = scan.nextInt();
        
        System.out.println("Enter the ending range");
        endRange = scan.nextInt();
        
        System.out.println("Input the input");
        input = scan.nextInt();
        
        while (input != 0) { //code repeats until 0 is inputed
            if (input < startRange || input > endRange) {
                sumOutside += input;
            } else {
                sumInside += input;
            }
            System.out.println("Input the input");
            input = scan.nextInt();
        }
        System.out.println("sum inside is: " + sumInside);
        System.out.println("sum outside is: " + sumOutside);
    }
}
