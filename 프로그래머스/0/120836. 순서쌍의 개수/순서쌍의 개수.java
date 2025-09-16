class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // for(int i = 1; i <= 1000; i++) {
        //     for(int j = 1; j <= 1000; j++) {
        //         if(i * j == n) answer++;
        //     }
        // }
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer++;
        }
        
        return answer;
    }
}