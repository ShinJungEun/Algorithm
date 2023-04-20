import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String lowerStr = s.toLowerCase();
        int pCount = lowerStr.length() - lowerStr.replace(String.valueOf("p"), "").length();
        int yCount = lowerStr.length() - lowerStr.replace(String.valueOf("y"), "").length();
        if(pCount == yCount) {
           answer = true; 
        } else {
            answer = false;
        }

        return answer;
    }
}