import java.util.Scanner;

class FantasyGame {
    public static void main(String[] args){
        
        String name;
        int strength, health, luck;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Yertles quest");
        System.out.println("Enter the name of your character");
        name = scan.nextLine();
        
        System.out.println("Enter strength (1-10)");
        strength = scan.nextInt();
        
        System.out.println("Enter health (1-10)");
        health = scan.nextInt();
        
        System.out.println("Enter luck (1-10)");
        luck = scan.nextInt();
        
        if (15 < (strength + health + luck)) {
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println("You have given your character too many points!");
            System.out.println("Default values have been assigned:");
            System.out.println( name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
        }
    }
}
        