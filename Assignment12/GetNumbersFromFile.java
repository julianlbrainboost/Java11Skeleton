import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int age, iq, gender, height;
        
        int totalPeople = 0;
        int totalMales = 0;
        int totalFemales = 0;
        int aboveAverageGuy = 0;
        int totalHeight = 0;
        int totalIQ = 0;
        int youngestAge = Integer.MAX_VALUE;
        int oldestAge = 0;
        
        while (scan.hasNextInt()) {
        age = scan.nextInt();    
            if (age == -1) {
            break;
        }
            iq = scan.nextInt();
            gender = scan.nextInt();
            height = scan.nextInt();
  
            if (age > oldestAge) {
               oldestAge = age;
            }
            
            if (age < youngestAge) {
                youngestAge = age;
            }
            
            if (gender == 1) {
            totalMales++;
            if (height > 72 && iq > 140) {
                aboveAverageGuy++;
            }
        } else if (gender == 0) {
            totalFemales++;
            }
        
        totalIQ += iq;
        totalHeight += height;
        
        totalPeople++;
        
      }
      
      int avgIq = totalIQ / totalPeople;
      
      System.out.println("Total people: " + totalPeople);
      System.out.println("Males: " + totalMales);
      System.out.println("Females: " + totalFemales);
      System.out.println("Males over 6 feet and greater than 140 IQ: " + aboveAverageGuy);
      System.out.println("Average IQ: " + totalIQ);
      System.out.println("Average height: " + totalHeight);
      System.out.println("Oldest age: " + oldestAge);
      System.out.println("Youngest age: " + youngestAge);
      scan.close();
   }
}