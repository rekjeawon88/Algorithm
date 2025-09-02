class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length = my_string.length();
        
        char[] arr = my_string.toCharArray();
        char[] arr2 = new char[length];
        
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[length - i - 1];
        }
        
        answer = new String(arr2);
        
        return answer;
    }
}