import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] numbers = new int[10];
        Set<Integer> remainders = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            remainders.add(numbers[i] % 42);
        }
        
        bw.write(String.valueOf(remainders.size()));
        bw.flush();
    }
}
