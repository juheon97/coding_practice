import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] prefix = new String[my_string.length()];
        int answer = 0;
        String pre_ch = "";
        for (int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            pre_ch += ch;
            prefix[i] = pre_ch;
        }
        // 배열에 들어갔는지 확인
        // System.out.println(Arrays.toString(prefix));
        
        for (String word : prefix) {
            // 참조 타입의 경누는 equals를 사용.
            if (word.equals(is_prefix)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}