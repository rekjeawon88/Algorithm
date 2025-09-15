class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int rank = 1;
            for (int j = 0; j < length; j++) {
                if (emergency[j] > emergency[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}
