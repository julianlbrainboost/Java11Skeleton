import java.util.Scanner;

class MathOperations {
    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        double first, second, added, subbed, mulpted, dived;
        
        System.out.println("Enter a number");
        first = scan.nextDouble();
        
        System.out.println("Enter another number");
        second = scan.nextDouble();
        
        added = first + second;
        subbed = first - second;
        mulpted = first * second;
        dived = first / second;
        
        System.out.println("added:.........." + added);
        System.out.println("subtracted:....." + subbed);
        System.out.println("multiplied:....." + mulpted);
        System.out.println("divided:........" + dived);
    }
}