import java.util.Scanner;

class InfoPrinted {
    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
    
        String name, adress, city, province, postalCode;
    
        System.out.println("Enter your name");
        name = scan.nextLine();
    
       System.out.println("Ok, now enter you adress");
       adress = scan.nextLine();
    
        System.out.println("Great, now enter the city you live in");
        city = scan.nextLine();
    
        System.out.println("now enter the province you live in");
        province = scan.nextLine();
    
        System.out.println("finally, enter your postal code");
        postalCode = scan.nextLine();
    
        System.out.println("Thank you for your cooperation " + name + " who lives at " + adress);
        System.out.println("in " + city + ", " + province + ". Your postal code is " + postalCode);
    }
}