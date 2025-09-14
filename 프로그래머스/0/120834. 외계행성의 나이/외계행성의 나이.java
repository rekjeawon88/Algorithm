class Solution {
    public String solution(int age) {
        String answer = "";
        
        String planet_age = String.valueOf(age);
        
        for(int i = 0; i < planet_age.length(); i++) {
            char x = planet_age.charAt(i);
            char y = (char)(x + 49);
            
            answer += y;
        }
        
        return answer;
    }
}