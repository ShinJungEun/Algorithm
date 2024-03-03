class Solution {
    public int solution(int[][] sizes) {
        int prevMax = 0;
        int prevMin = 0;
        for (int[] size: sizes) {
            int curMax = Math.max(size[0], size[1]); // 명함 넓은 길이
            int curMin = Math.min(size[0], size[1]); // 명함 좁은 길이
            
            prevMax = Math.max(curMax, prevMax);
            prevMin = Math.max(curMin, prevMin);
        }
        
        return prevMax * prevMin;
    }
}