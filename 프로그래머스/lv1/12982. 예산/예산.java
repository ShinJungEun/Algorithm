import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int currAmt = 0;
        
        for(int i = 0; i < d.length; i++) {
            if(currAmt + d[i] > budget) {
                break;   
            }
            answer++;
            currAmt += d[i];
        }
        return answer;
    }
}