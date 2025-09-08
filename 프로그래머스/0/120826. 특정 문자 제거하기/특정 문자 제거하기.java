class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        int length = my_string.length();
        
        char[] arr = my_string.toCharArray();
        char[] arr2 = new char[length];
        
        int tmp = 0;
        
        for(int i = 0; i < length; i++) {
            if(arr[i] != letter.charAt(0)) {
               arr2[tmp] = arr[i];
                tmp++;
            }
        }
        
        answer = new String(arr2, 0, tmp);
        
        return answer;
    }
}