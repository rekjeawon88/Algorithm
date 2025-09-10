import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[9];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int max = Arrays.stream(arr).max().getAsInt();
        int index = 1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != max) index++;
            else break;   
        }
        
        bw.write(max + "\n" + index + "\n");

        bw.flush();
    }
}