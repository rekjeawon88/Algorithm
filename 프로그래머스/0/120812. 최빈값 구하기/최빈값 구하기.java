import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int max = array[array.length - 1];
        int[] dupl = new int[max + 1];
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
            dupl[array[i]] += 1;
        }
        
        // 배열 돌면서 최댓값 찾기
        for(int j = 0; j < dupl.length; j++) {
            if(dupl[j] > count) {
                count = dupl[j];
                answer = j;
            }
            else if(dupl[j] == count) {
                answer = -1;
            }
        }
        
        return answer;
    }
}