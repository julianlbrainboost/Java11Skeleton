import java.util.Scanner ;

class OrderChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pricePerBolt = 0.05;
        final double pricePerNut = 0.03;
        final double pricePerWasher = 0.1;
         
        double amountBolts, amountNuts, amountWashers, totalPrice;
       
        System.out.println("Enter amount of bolts");
        amountBolts = sc.nextDouble();
        
        System.out.println("Enter amount of nuts");
        amountNuts = sc.nextDouble();
        
        System.out.println("Enter amount of nuts");
        amountWashers = sc.nextDouble();
        
        
        if (amountBolts > amountNuts || amountBolts > (amountWashers * 2)) 
        {
       
            if (amountBolts > (amountWashers * 2)) {
            System.out.println("Check the order: too few washers.");
        }
            if (amountBolts > amountNuts) {
            System.out.println("Check the order: too few nuts.");
        }                           
    }
    else {
        System.out.println("the order is fine");
    }
    totalPrice = (pricePerBolt * amountBolts + pricePerNut * amountNuts + pricePerWasher * amountWashers);
  }
}