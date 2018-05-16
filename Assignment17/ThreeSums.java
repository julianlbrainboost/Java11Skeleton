import java.io.*;

class ThreeSums {

    public static void main(String[] args) throws IOException {
        int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };

        int evenSum = 0;
        int oddSum = 0;
        int totalSum = 0;
        
        for (int index = 0; index < data.length; index++) {
           if (data[index] % 2 ==0) {
               evenSum += data[index];
            } else {
               oddSum += data[index];
           }
        }
        totalSum = evenSum + oddSum;
        
        System.out.println("Even Sum:....... " + evenSum);
        System.out.println("Odd Sum:........ " + oddSum);
        System.out.println("Total Sum:...... " + totalSum);
    }
}