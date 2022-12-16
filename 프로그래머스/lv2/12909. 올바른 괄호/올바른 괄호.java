import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i); 
            if(curr == '(') {
                st.push(curr);
            } else if(curr == ')') {
                if(st.empty()) {
                    answer = false;
                    break;
                } else {
                    Character top = st.peek();
                    st.pop();
                    if(top == ')') {
                        answer = false;
                        break;
                    }
                }
            }
        }
        if(!st.empty()) {
            answer = false;
        }

        return answer;
    }
}