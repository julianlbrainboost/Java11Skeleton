import java.util.Scanner ;

class PieEatingContest {
    public static void main(String[] args) {
        int weight;
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter your weight in pounds");
        weight = sc.nextInt();

         if (weight < 220) {
         System.out.println("Congratulations! I mean you didn't make it in to the contest, but you are light enough");
         System.out.println("to possibly not be rejected by girls, don't blow it by gaining more weight you fat f*ck");
        }
         if (weight >= 220 && weight <= 280) {
         System.out.println("You are eligible for the contest, I hope those pies are worth it because you are definitely");
         System.out.println("too heavy to be loved by anyone other than your mother, but it's not too late too turn back,");
         System.out.println("the choice is yours.");
        }
         if (weight > 280) {
         System.out.println("Jeez you are overweight. Please, please for the sake of everyone you love, consult a doctor");
         System.out.println("about your diet.");
        }
    }
}