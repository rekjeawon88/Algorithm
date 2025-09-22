class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] tmp = rsp.split("");
        int[] arr = new int[tmp.length];
        
        for(int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
            
            switch (arr[i]) {
                case 2:
                    answer += '0';
                    break;
                case 0:
                    answer += '5';
                    break;
                case 5:
                    answer += '2';
            }
        }
        
        return answer;
    }
}