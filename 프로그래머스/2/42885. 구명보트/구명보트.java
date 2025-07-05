import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        int[] sortArr = people;
        Arrays.sort(sortArr);
        int[] endIdx = new int[people.length];
        Arrays.fill(endIdx, 0);
        
        int min = 0;
        for(int max = people.length-1; min <= max; max--) {
            if(sortArr[min] + sortArr[max] <= limit) {
                min++;
            }
            answer++;
        }
        
        return answer;
    }
}