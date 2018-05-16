import java.util.Scanner;

class TimesTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter time table: ");
        int tableChoice = scan.nextInt();
        scan.nextLine();
        
        int correctAnswers = 0;
        
        for (int i = 1; i <= tableChoice; i++) {
            
            System.out.println(tableChoice + "*" + i + "=");
            int inputAnswer = scan.nextInt();
            scan.nextLine();
            
            if (inputAnswer ==(tableChoice * i)) {
                System.out.println("Correct");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. Answer is: " + (tableChoice * i));
            }
        }
        System.out.println("You got " + correctAnswers + " out of " + tableChoice);
    }
}