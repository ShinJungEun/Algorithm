import java.util.*;

class Solution {
    
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i == j) {
                    continue;
                }
                int sum = numbers[i] + numbers[j];
                if(!arr.contains(sum)) {
                    arr.add(sum);
                }
            }
        }
        Collections.sort(arr);
        answer = arr.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}