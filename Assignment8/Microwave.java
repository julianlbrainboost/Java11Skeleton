import java.util.Scanner;

class Microwave {
    public static void main(String[] args){
        
        int amountItems;
        double heatingTime;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter amount of items");
        amountItems = scan.nextInt();
        
        System.out.println("Enter amount of time");
        heatingTime = scan.nextDouble();
        
        
        if (amountItems == 1) {
           System.out.println("Heating time: " + heatingTime); 
            
        } else if (amountItems == 2) {
           System.out.println("Heating time: " + heatingTime * 1.5);
            
        } else if (amountItems == 3) {
           System.out.println("Heating time: " + heatingTime * 2);
        
        } else if (amountItems > 3) {
           System.out.println("The microwave exploded, instantly vaporising everything");
           System.out.println("within a 12 km radius, you died.");
        }
    }
}