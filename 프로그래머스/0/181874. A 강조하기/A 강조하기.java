class Solution {
    public String solution(String myString) {
        String answer = "";
        String lowerCase = myString.toLowerCase();

        for (int i = 0; i < myString.length(); i++) {
            char ch = lowerCase.charAt(i); 
            if (ch == 'a') {
                answer += 'A'; 
            } else {
                answer += ch; 
            }
        }
        return answer;
    }
}