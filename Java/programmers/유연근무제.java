class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i = 0; i < schedules.length; i++) {
            boolean isOnTime = true;
            int day = startday;
            for (int j = 0; j < timelogs[i].length; j++){
                if ((day % 7) == 6) {  
                    day++;
                    continue;
                } 
                else if ((day % 7) == 0) {  
                    day = 1;
                    continue;
                }
                
                int scheduleTime = schedules[i];
                int allowedTime = calcuateHours(scheduleTime); 
                int logTime = timelogs[i][j];
                day++;
                
              
                if (allowedTime < logTime) {
                    isOnTime = false;
                    break;
                }
            }
            if(isOnTime == false) {
                continue;
            }
            else {
                answer++;
            }
        
        }
        
        return answer;
    }
    
    private int calcuateHours(int scheduleTime) {
        int hours = scheduleTime / 100;
        int minutes = scheduleTime % 100;

        minutes += 10;

        if (minutes >= 60) {
            hours += 1;
            minutes -= 60;
        }


        if (hours >= 24) {
            hours -= 24;
        }

        return hours * 100 + minutes;
    }
}
