class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int service_drink = n / 10;
        int total_drink = k - service_drink;
        
        answer = (12000 * n) + (2000 * total_drink);
        
        return answer;
    }
}