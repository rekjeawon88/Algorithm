class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        switch (direction) {
            case "left":
                for(int i = 0; i < numbers.length - 1; i++) {
                    answer[i] = numbers[i + 1];
                }
                
                answer[numbers.length - 1] = numbers[0];
                
                break;
                
             case "right":
                for(int i = numbers.length - 1; i > 0; i--) {
                    answer[i] = numbers[i - 1];
                }
                
                answer[0] = numbers[numbers.length - 1];
                
                break;
                
            default:
                System.out.println("direction error");
        }

        return answer;
    }
}