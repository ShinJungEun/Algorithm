class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        String str = s;
        int zeroCount = 0; // 제거된 0의 개수
        int count = 0; // 이진 변환 횟수
        while(true) {
            count++;
            zeroCount += str.length() - str.replaceAll("0", "").length();
            int i = str.replaceAll("0", "").length();
            str = Integer.toBinaryString(i);
            if("1".equals(str)) {
                break;
            }
        }
        
        answer[0] = count;
        answer[1] = zeroCount;
            
        return answer;
    }
}