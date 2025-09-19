import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int M = Integer.parseInt(input1[1]);
        
        // 바구니 생성 및 값 초기화
        int[] basket = new int[N];
        for(int x = 1; x <= N; x++) {
            basket[x - 1] = x;
        }
        
        for(int x = 0; x < M; x++) {
            String[] input2 = br.readLine().split(" ");
            int i = Integer.parseInt(input2[0]) - 1;
            int j = Integer.parseInt(input2[1]) - 1;
            
            int tmp = 0;
            
            // 바구니 안의 공 바꾸기
            tmp = basket[j];
            basket[j] = basket[i];
            basket[i] = tmp;
        }
        
        for(int x = 0; x < N; x++) {
            bw.write(basket[x] + " ");
        }
        
        bw.flush();
    }
}