import java.util.Scanner;

class ParcelShipping {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double height, width, depth, weight;
        double volume;
        double basicCharge = 5, totalCharge;
        double overSizeCharge = 0, overWeightCharge = 0;
        
        System.out.println("Enter package height");
        height = scan.nextDouble();
        
        System.out.println("Enter package width");
        width = scan.nextDouble();
        
        System.out.println("Enter package depth");
        depth = scan.nextDouble();
        
        System.out.println("Enter package weight");
        weight = scan.nextDouble();
        
        volume = height * width * depth;
        
        if (volume > 5) {
            overSizeCharge = 20;
        }
        if (weight > 5) {
            overWeightCharge = 10;
        }
        
        totalCharge = overWeightCharge + overSizeCharge + basicCharge;
        
        System.out.println("Basic charge:..........." + basicCharge);
        System.out.println("Oversize charge:........" + overSizeCharge);
        System.out.println("Overweight charge:......" + overWeightCharge);
        System.out.println("Total cost:............." + totalCharge);
    }
}