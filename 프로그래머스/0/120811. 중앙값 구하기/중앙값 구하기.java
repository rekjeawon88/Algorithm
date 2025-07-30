class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        int center = -9999;
        
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                }
            }
        }
        
        center = array.length / 2;
        answer = array[center];
        
        return answer;
    }
}