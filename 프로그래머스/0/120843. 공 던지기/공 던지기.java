class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int throwing = (2 * (k - 1)) % numbers.length; 
        
        answer = numbers[throwing];
        
        return answer;
    }
}