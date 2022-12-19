class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            int count = divisorCount(i);
            if(count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    public int divisorCount(int n) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n / i == i) {
                    count++;   
                }
                else {
                    count += 2;
                }
            }
        }
        
        return count;
    }
}