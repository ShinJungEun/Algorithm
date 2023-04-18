class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 2;
        while(true) {
            if(n % x == 1) {
                break;
            } else if(x == n) {
                x = 3;
                break;
            }
            x++;
        }
        answer = x;
        return answer;
    }
}