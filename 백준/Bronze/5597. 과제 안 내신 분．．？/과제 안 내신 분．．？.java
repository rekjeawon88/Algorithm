import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] submitted = new int[28];
        
        // 제출자 목록
        for(int i = 0; i < 28; i++) {
            submitted[i] = Integer.parseInt(br.readLine());
        }
        
        // 제출자 확인 명단
        boolean[] isSubmitted = new boolean[30];
        
        for(int i = 0; i < 28; i++) {
            isSubmitted[submitted[i] - 1] = true;
        }
        
        for(int i = 0; i < 30; i++) {
            if(isSubmitted[i] == false) {
                bw.write((i + 1) + "\n");
            }
        }
        
        bw.flush();
    }
}
