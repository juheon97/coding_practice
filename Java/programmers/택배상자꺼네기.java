class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        boolean left = true;
        int maxC = n/w+(n%w==0?0:1);
        int c = 0;
        int r = 0;
        int numc = 0;
        int numr = 0;
        
        int[][] boxes = new int[maxC][w];
        
        for(int i=1; i <=n; i++){
            if(i==num){
                numc=c;
                numr=r;
            }
            if(left){
                boxes[r][c] =i;
                if(c==w-1){
                    r++;
                    left = false;
                }
                else{
                    c++;
                }
            }
            else {
                boxes[r][c]=i;
                if(c==0){
                    r++;
                    left = true;
                }
                else {
                    c--;
                }
            }
        }
        while(numr<maxC){
            if(boxes[numr][numc]!=0){
                answer++;
            }
            numr++;
        }
        return answer;
    }
}