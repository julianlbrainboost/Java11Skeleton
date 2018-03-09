import java.util.Scanner;
class Question3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long years, days;

        System.out.println("Enter an year:");
        years = scan.nextInt();
        
        days = years * 365;

        System.out.println ( years + "years in days is" + days );
    }
}
