import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // int 형태로는 못 받고 무조건 String 형태로 받아서 사용자가 형태 변환해야 함
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            bw.write((A + B) + "\n"); // 출력이 아니라 버퍼에 쌓아두는 것
        }
        
        bw.flush(); // 출력
    }
}
