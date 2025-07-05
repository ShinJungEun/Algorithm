import java.util.*;

class Solution
{   
    public int solution(int []A, int []B)
    {
        int answer = 0;

        int[] sortA = A;
        Arrays.sort(sortA);
        int[] sortB = B;
        Arrays.sort(sortB);
        
        int idx = 0; 
        for(int i = A.length-1; i >= 0; i--) {
            answer += sortA[i] * sortB[idx];
            idx++;
        }

        return answer;
    }
}