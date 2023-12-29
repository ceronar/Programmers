class Solution {
    public int solution(int num) {
        long longNum = (long)num;
        int answer = 0;
        while(longNum != 1 && answer != 500) {
            if(longNum % 2 == 0) {
                longNum = longNum / 2;
            } else {
                longNum = (longNum * 3) + 1;
            }
            answer++;
        }
        if(answer == 500) {
            answer = -1;
        }
        return answer;
    }
}