import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for(int i = 4; i <= N; i += 4) {
            System.out.print("long ");
        }
        
        System.out.println("int");
        
    }
}
