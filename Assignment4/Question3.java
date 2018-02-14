public class Question3 extends Question3 {
    public static void main(String[] args) {
        double ticket = 23.45;
        double amount = 8;
        double tax = 0.12;
        double total = 0;

        System.out.println("total = " + (ticket * amount * tax) + ticket * amount + " dollars ");
        System.out.println("tax = " + ticket * amount * tax + " dollars ");
    }
}