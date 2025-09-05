class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int length = my_string.length();
        
        char[] arr = my_string.toCharArray();
        char[] arr2 = new char[length * n];
        int tmp = 0;
        
        for(int i = 0; i < arr.length; i++) {
           for(int j = 0; j < n; j++) {
               arr2[tmp++] = arr[i];
           }
        }
        
        answer = new String(arr2);
        
        return answer;
    }
}