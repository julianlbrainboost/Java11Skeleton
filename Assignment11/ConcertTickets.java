import java.util.Scanner;

class ConcertTickets {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double ticket, cost, subtotal, gst, pst, total;
        
        System.out.println("Enter the price of one ticket");
        cost = scan.nextDouble();
        
        System.out.println("Enter the amount of tickets for purchasing");
        ticket = scan.nextDouble();
        
        subtotal = ticket * cost;
        gst = subtotal * 0.06;
        pst = subtotal * 0.07;
        total = subtotal + gst + pst;
        
        System.out.println("subtotal:......" + subtotal);
        System.out.println("GST:..........." + gst);
        System.out.println("PST:..........." + pst);
        System.out.println("total.........." + total);
    }
}