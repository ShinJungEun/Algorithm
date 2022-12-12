class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int startNum = a;
        int endNum = b;
        if(startNum > endNum) {
            startNum = b;
            endNum = a;
        }
        
        for(int i = startNum; i <= endNum; i++) {
            answer += i;
        }
        return answer;
    }
}