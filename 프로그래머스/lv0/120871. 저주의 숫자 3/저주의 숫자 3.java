class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[101];
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            int tmp = arr[i-1] + 1;
            while(true) {
                if(tmp % 3 == 0) {
                    // 3의 배수인 경우
                    tmp++;
                } else if(Integer.toString(tmp).contains("3")) {
                    // 숫자 3을 포함하는 경우 
                    tmp++;
                } else {
                    break;
                }
            }
            arr[i] = tmp;
        }
        answer = arr[n];
        return answer;
    }
}