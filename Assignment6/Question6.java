import java.util.Scanner;
class Question6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name, feature, animal;

        System.out.println("Enter Name:");
        name = scan.nextLine();
        
        System.out.println("Enter Feature:");
        feature = scan.nextLine();
        
        System.out.println("Enter Animal:");
        animal = scan.nextLine();
        
        System.out.println ( name + " has an " + feature + " like a " + animal);
    }
}
