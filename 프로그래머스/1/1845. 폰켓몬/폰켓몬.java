import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pm = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap();
        
        for (Integer n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        if (pm < map.size()) {
            answer = pm;
        }else {
            answer = map.size();
        }
 
        return answer;
        
        
    }
}