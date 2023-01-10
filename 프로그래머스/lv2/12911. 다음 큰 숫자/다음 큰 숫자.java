import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = n + 1;
        String binaryN = Integer.toBinaryString(n);
        int nCount = binaryN.length() - binaryN.replace("1", "").length();
        while(true) {
            String binaryK = Integer.toBinaryString(k);
            int kCount = binaryK.length() - binaryK.replace("1", "").length();
            if(nCount == kCount) {
                break;
            }
            k++;
        }
        answer = k;
        
        return answer;
    }
}