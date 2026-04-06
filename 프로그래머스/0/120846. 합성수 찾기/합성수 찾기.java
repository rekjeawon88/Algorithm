class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            int factor = 0;
            
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) factor++;
            }
            
            if(factor >= 3) answer++;
        }
        
        return answer;
    }
}

// 최적화
// class Solution {
//     public int solution(int n) {
//     int answer = 0;
//
//     for (int i = 4; i <= n; i++) {
//         for (int j = 2; j < i; j++) {
//             if (i % j == 0) {
//                 answer++;
//                 break;
//             }
//         }
//     }
//
//     return answer;
//     }
// }
