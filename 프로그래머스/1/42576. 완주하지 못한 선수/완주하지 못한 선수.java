import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> countMap = new HashMap();
        
        for (String p : participant) {
            countMap.put(p, countMap.getOrDefault(p,0) + 1);
        }
        
        for (String c : completion) {
            countMap.put(c, countMap.get(c)-1);
        }
        
        for (String key : countMap.keySet()) {
            if (countMap.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}