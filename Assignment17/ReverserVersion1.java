import java.io.*;

class ReverserVersion1 {

    public static void main(String[] args) throws IOException {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        
        
        for (int j = 0; j < data.length / 2; j++) {
            int temp = data[j];
            //reversed inside data
            data[j] = data[data.length - j - 1];
            data[data.length - j -1] = temp;
        }
        
         
        for (int j = 0; j < data.length; j++) {
            System.out.println(data[j]);
        }

    }
}