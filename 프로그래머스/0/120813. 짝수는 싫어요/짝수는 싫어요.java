class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int m = 0;
        
        if(n % 2 == 1) {
            answer = new int[n / 2 + 1];
        } else {
            answer = new int[n / 2];
        }
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer[m] = i;
                m++;
            }
        }
        
        
        return answer;
    }
}