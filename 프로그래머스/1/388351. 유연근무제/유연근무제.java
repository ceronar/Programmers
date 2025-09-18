class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i < schedules.length; i++) {
            int day = startday;
            int workTime = (((schedules[i]+10)%100) >= 60) ? (schedules[i]+50) : schedules[i]+10;
            
            for(int j = 0; j < 7; j++) {
                if(day % 7 == 0 || day % 7 == 6) {
                    day++;
                    continue;
                }
                if(workTime >= timelogs[i][j]) {
                    count++;
                }
                day++;
            }
            if(count == 5) {
                answer++;
            }
            count = 0;
        }
        return answer;
    }
}