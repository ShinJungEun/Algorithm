import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        long tmp = n;
        List<Integer> list = new ArrayList<>();
        while(tmp > 0) {
            list.add((int)(tmp % 10));
            tmp /= 10;
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}