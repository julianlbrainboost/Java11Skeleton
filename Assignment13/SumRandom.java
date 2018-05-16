import java.util.Scanner;
import java.util.Random;

class SumRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();

        int num;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            num = generaterandom.nextInt(25) + 1;
            sum += num;
            System.out.println(i + " " + num);
        }
        System.out.println("sum is: " + sum);
    }
}