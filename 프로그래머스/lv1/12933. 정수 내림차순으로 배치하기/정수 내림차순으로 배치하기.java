import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<String> arr = Arrays.asList((n + "").split(""));
        Collections.sort(arr, Collections.reverseOrder());
        String str = String.join("", arr);
        answer = Long.parseLong(str);
        return answer;
    }
}