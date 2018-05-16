import java.util.Scanner;

class LibraryFine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int timeOverdue;
        char fine;
            
        while (true) {
            double fineVal = 0;
            System.out.println("Enter days overdue. Enter '0' to exit");
            timeOverdue = scan.nextInt();
            scan.nextLine();
            
            if (timeOverdue == 0) {
                break;
            }
            System.out.println("Enter fine grade: ");
            String fineString = scan.nextLine();
            fineString = fineString.trim();
            fineString = fineString.toUpperCase();
            fine = fineString.charAt(0);
            switch (fine) {
                case 'A':
                    fineVal = 0.10;
                    break;
                case 'B':
                    fineVal = 0.25;
                    break;
                case 'C':
                    fineVal = 0.50;
                    break;
                case 'D':
                    fineVal = 1.00;
                    break;
                case 'E':
                    fineVal = 2.00;
                    break;
                case 'F':
                    fineVal = 5.00;
                    break;
                }
            double fineTotal = fineVal * timeOverdue;
            System.out.println("Days overdue:......" + timeOverdue);
            System.out.println("Fine total:........" + fineTotal);
            }
        }
    }
