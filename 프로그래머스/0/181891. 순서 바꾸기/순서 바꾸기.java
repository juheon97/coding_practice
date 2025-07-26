import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = n; i < num_list.length; i++){
            answer.add(num_list[i]);
        }
        for(int j = 0; j < n; j++){
            answer.add(num_list[j]);
        }
        
        // Integer와 int는 다름 그래서 변환시켜줌
        return answer.stream().mapToInt(i -> i).toArray();
    }
}