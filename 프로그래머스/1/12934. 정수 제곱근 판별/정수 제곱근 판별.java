class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrtNum = Math.sqrt(n);
        if(sqrtNum % 1 == 0.0) {
            answer = (long)Math.pow(sqrtNum + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}