import java.util.Scanner;

class DrugPotency {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double effectiveness = 100;
        double monthlyDecayPercent = 0.04;
        int month = 0;
        
        System.out.println("Enter amount of months in storage");
        month = scan.nextInt();
        
        while (effectiveness > 50) { //Loop?
            System.out.println("Effectivness: .................... " + effectiveness);
            System.out.println("Monthly percentage of decay: ..... " + monthlyDecayPercent);
            effectiveness = effectiveness - (monthlyDecayPercent * effectiveness);
            month++;
        }
        System.out.println("Drug is no longer effective after " + month + " months in storage");
    }
}