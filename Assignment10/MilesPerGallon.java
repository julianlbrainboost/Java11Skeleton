import java.util.Scanner;

    class MilesPerGallon {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double initialmiles, finalmiles, gallons;

        System.out.print("Enter initial miles: ");

        initialmiles = scan.nextDouble();
        //Code repeats until -1 is inputed
        while (!(initialmiles == -1)) {

            System.out.print("Enter Final Miles: ");

            finalmiles = scan.nextDouble();

            System.out.print("Enter gallons: ");

            gallons = scan.nextDouble();

            System.out.println("Miles per Gallon: "+( finalmiles-initialmiles )/gallons);

            System.out.println();

            System.out.print("Enter initial miles (-1 to exit): ");

            initialmiles = scan.nextDouble();
        }

        System.out.println("Bye");
    }
}