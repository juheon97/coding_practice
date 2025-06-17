import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        String[] answer = players.clone();
        
        HashMap<String, Integer> playerIndex = new HashMap<>();
        for(int i = 0; i < answer.length; i++) {
            playerIndex.put(answer[i], i);
        }
        
        for (String calling : callings) {
            int currentPos = playerIndex.get(calling);
            
            if(currentPos > 0) {

                String frontPlayer = answer[currentPos - 1];
                
                answer[currentPos - 1] = calling;
                answer[currentPos] = frontPlayer;
                
                playerIndex.put(calling, currentPos - 1);
                playerIndex.put(frontPlayer, currentPos);
            }
        }
        
        return answer;
    }
}