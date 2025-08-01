import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        
        if(minute < 45) {
            if(hour == 0) {
                hour = 23;
                minute = minute + 60 - 45;
                System.out.printf("%d %d", hour, minute);
            } else if(0 < hour && hour <= 23) {
                hour -= 1;
                minute = minute + 60 - 45;
                System.out.printf("%d %d", hour, minute);
            }
        } else if(45 <= minute && minute <= 60) {
            minute -= 45;
            System.out.printf("%d %d", hour, minute);
        }
        
    }
}