public class Question5 {
    public static void main(String[] args) {
        double quantity = 19;
        double price = 1.47;
        double total = 0;
         for (int i = 0; i < quantity; i++) {
             total = price + total;
            System.out.println ("This is line " + i);

            System.out.println ("Anything between the { and } will repeat 10 }times");
        }
        System.out.println ( "total cost equals" + total);
    }
}