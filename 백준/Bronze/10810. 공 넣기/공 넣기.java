import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int M = Integer.parseInt(input1[1]);
        
        int[] basket = new int[N];
        
        for(int x = 0; x < M; x++) { // M번 반복
            String[] input2 = br.readLine().split(" ");
            int i = Integer.parseInt(input2[0]); // 시작
            int j = Integer.parseInt(input2[1]); // 끝
            int k = Integer.parseInt(input2[2]); // 값
            
            for(int y = i; y <= j; y++) {
                basket[y - 1] = k;
            }
        }
        
        for(int x = 0; x < basket.length; x++) {
            bw.write(String.valueOf(basket[x]) + " ");
        }
        
        bw.flush();
    }
}
