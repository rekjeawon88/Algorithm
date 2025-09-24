class Solution {
    public int[][] solution(int[] num_list, int n) {
        int raw = num_list.length / n;
        int[][] answer = new int[raw][n];
        
        int tmp = 0;
        
        for(int i = 0; i < raw; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[tmp];
                tmp++;
            }
        }
        
        return answer;
    }
}