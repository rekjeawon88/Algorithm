import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
            String[] input = br.readLine().split(" ");
            
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            if(A == 0 && B == 0) {
                break;
            }
                        
            bw.write((A + B) + "\n");
        }
            
        bw.flush();
    }
}