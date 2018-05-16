import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int age = 0, iq =0, gender = 0, height = 0;
        File file = new File("data.txt");
        PrintStream print = new PrintStream(file);

        while (true) {
            System.out.print("Age(-1 to exit): ");
            age = scan.nextInt();
            if (age == -1) {
            print.println(age);
            break;
        }
        
        print.println(age);
        
        System.out.print("IQ: ");
        iq = scan.nextInt();
        print.println(iq);
        
        System.out.print("Gender (0 for female, 1 for male): ");
        gender = scan.nextInt();
        print.println(gender);
        
        System.out.println("Height: ");
        height = scan.nextInt();
        print.println(height);
    }


        print.close();
    }
}