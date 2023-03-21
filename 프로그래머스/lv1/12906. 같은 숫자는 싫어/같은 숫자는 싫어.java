import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
        }
        
        answer = new int[st.size()];
        for(int i = answer.length -1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}