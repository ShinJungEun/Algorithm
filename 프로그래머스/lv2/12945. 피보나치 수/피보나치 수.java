class Solution {
    static int m = 1234567;
    
    public int solution(int n) {    
        int answer = 0;
        long[] fibo = new long[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i <= n; i++) {
            fibo[i] = ((fibo[i-2] % m) + (fibo[i-1] % m)) % m;
        }
        
        answer = (int)fibo[n] % m;
        return answer;
    }

}