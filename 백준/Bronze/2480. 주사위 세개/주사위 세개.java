import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int price = 0;
        
        if(A > B && A > C) {
            price = A * 100;
        } else if(B > A && B > C) {
            price = B * 100;
        } else if(C > A && C > B) {
            price = C * 100;
        }
        
        if(A == B) {
            price = 1000 + (A * 100);
        } else if(B == C) {
            price = 1000 + (B * 100);
        } else if(C == A) {
            price = 1000 + (C * 100);
        }
                
        if(A == B && B == C && C == A) {
            price = 10000 + (A * 1000);
        }
     
        System.out.printf("%d", price);
        
    }
}