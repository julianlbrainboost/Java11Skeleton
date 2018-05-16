import java.util.Scanner ;

class LastChanceGas {
    public static void main(String[] args) {
        int fuelCapacity;
        int currentFuelpercent;
        int milesPerGallon;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your gas tank capacity: ");
        fuelCapacity = sc.nextInt();
        
        System.out.println("Enter current amount of fuel: ");
        currentFuelpercent = sc.nextInt();
        
        System.out.println("Enter a car efficiency (miles per gallon) ");
        milesPerGallon = sc.nextInt();
        
        
        int range = ((currentFuelpercent / 100) * fuelCapacity) * milesPerGallon;
        
         if (range >= 200) {
           System.out.println("Safe to proceed "); 
             
        } else {
           System.out.println("Get gas, And remember: ");
           System.out.println("Winners don't use drugs, except steroids, In which case use lots of drugs.");
            }
       
        
    }
}