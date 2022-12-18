import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        
        if(!Pattern.matches("^[0-9]*$", s)) {
            answer = false;
        }
        
        return answer;
    }
}