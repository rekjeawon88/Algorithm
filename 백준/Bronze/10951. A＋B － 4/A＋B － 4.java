import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        
        while ((line = br.readLine()) != null) { // EOF 감지
            String[] input = line.split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            bw.write((A + B) + "\n");
        }

        bw.flush();
    }
}
