class Solution {
    public int solution(int n) {
        int answer = 0;
        Double sqrtNum = Math.sqrt(n);
        if(sqrtNum == sqrtNum.intValue()) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}