import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        
        int N = Integer.parseInt(input1[0]);
        int X = Integer.parseInt(input1[1]);
        
        for(int i = 0; i < N; i++) {
            if(Integer.parseInt(input2[i]) < X) {
                bw.write(input2[i] + " ");
            }
        }
        
        bw.flush();
        
    }
}