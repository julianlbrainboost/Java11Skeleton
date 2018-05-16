import java.util.Scanner ;

class GroundBeefValueCalculator {
    public static void main(String[] args) {
        double pricePerPoundA, pricePerPoundB, percentLeanA, percentLeanB;
        double pricePerPoundLeanA, pricePerPoundLeanB;
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter the price of package A per pound");
        pricePerPoundA = sc.nextDouble();
        
        System.out.println("Enter the price of package B per pound");
        pricePerPoundB = sc.nextDouble();
        
        System.out.println("Enter the percentage of lean in package A");
        percentLeanA = sc.nextDouble();
        
        System.out.println("Enter the percentage of lean in package B");
        percentLeanB = sc.nextDouble();
        
        pricePerPoundLeanA = (percentLeanA / 100) * pricePerPoundA ;
        pricePerPoundLeanB = (percentLeanB / 100) * pricePerPoundB ;
        
        System.out.println("package A is $" + pricePerPoundLeanA + " per pound lean.");
        System.out.println("package B is $" + pricePerPoundLeanB + " per pound lean.");
        
        if (pricePerPoundA > pricePerPoundB) {
        System.out.println("Package B gives you more pounds of lean per price");
      }
        else {
        System.out.println("Package A gives you more pounds of lean per price");
      }
   }
}
