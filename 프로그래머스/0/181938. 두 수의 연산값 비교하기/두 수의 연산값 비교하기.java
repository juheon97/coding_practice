class Solution {
    public int solution(int a, int b) {
        int f = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int answer = 0;
        
        if (f >= (2 * a * b)) {
            answer = f;
        } else if (f <= (2*a*b)){
            answer = (2*a*b);
        }
        return answer;
    }
}