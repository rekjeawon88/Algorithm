class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        
        if(0 <= num1 && num1 <= 100) {
            if(0 <= num2 && num2 <= 100) {
                answer = (double) num1 / num2;
            }
        }
        
        return (int) (answer * 1000);
    }
}