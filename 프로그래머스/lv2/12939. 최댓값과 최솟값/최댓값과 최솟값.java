import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] intArr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intArr);
        answer += intArr[0] + " " + intArr[intArr.length - 1];
        
        return answer;
    }
}