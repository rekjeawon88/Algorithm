class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i >= Math.ceil((double) n / slice)) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}