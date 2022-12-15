import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        int count = 1;
        List<String> wordList = new ArrayList<String>();
        if(words.length > 0) {
            wordList.add(words[0]);
        }
        for(int i = 1; i < words.length; i++) {
            if((i + 1) % n == 0) { // 차례가 한바퀴 돌았을 때
                count++;
            }
            String prevStr = words[i-1].substring(words[i-1].length() - 1, words[i-1].length());
            String nextStr = words[i].substring(0, 1);
            if(!prevStr.equals(nextStr) || wordList.contains(words[i])) {
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = i / n + 1;
                break;
            }
            wordList.add(words[i]);
        }
        
        return answer;
    }
}