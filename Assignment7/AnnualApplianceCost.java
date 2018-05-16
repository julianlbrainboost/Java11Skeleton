import java.util.Scanner;

class AnnualApplianceCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double unitprice;
        double individualprice;
        double totalcost;
        
        System.out.println("Enter cost per kwh");
        unitprice = sc.nextDouble();
        
        System.out.println("Enter units used");
        individualprice = sc.nextDouble();
        
        totalcost = individualprice * unitprice;
        
        System.out.println("Annual cost is:" + totalcost);
        
    }
}
    