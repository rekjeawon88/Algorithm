import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 정수끼리 하면 소숫점이 안나와서 올림 실패
        answer = (int) Math.ceil(n / 7.0);
        
        return answer;
    }
}