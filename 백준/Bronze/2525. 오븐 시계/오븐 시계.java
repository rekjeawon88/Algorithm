import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        int beforeCookTime = A * 60 + B;
        int afterCookTime = beforeCookTime + C;
        
        int afterCookHour = (afterCookTime / 60) % 24;
        int afterCookMinute = afterCookTime % 60;
        
        System.out.printf("%d %d", afterCookHour, afterCookMinute);
        
    }
}