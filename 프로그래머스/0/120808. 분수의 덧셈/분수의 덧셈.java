class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        // numer = 분자, denom = 분모, gcd = 최대공약수
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int gcd = 1;
        
        for(int i = 1; i <= numer && i <= denom; i++) {
            if(numer % i == 0 && denom % i == 0) {
                gcd = i;
            }
        }
        
        answer = new int[]{numer / gcd, denom / gcd};
        
        return answer;
    }
}