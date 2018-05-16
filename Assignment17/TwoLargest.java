import java.io.*;

class TwoLargest {

  public static void main(String[] args) throws IOException {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    int largest = data[0];
    int secondLargest = data[0];

    for (int index = 0; index < data.length; index++) {
        if (data[index] > largest) {
            largest = data[index];
        }
        if (data[index] > secondLargest && data[index] < largest) {
            secondLargest = data[index];
        }
    }

    System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
  }
}