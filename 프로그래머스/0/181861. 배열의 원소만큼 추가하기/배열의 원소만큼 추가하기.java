import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        
        List<Integer> answer = new ArrayList<>();
        
        for (int num : arr){
            for (int i = 0; i < num; i++) {
                answer.add(num);
            }
        }
        
        return answer;
    }
}