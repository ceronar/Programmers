class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health; // 현재 체력
        int con = 0; // 연속성공
        int atkSts = 0; // 공격 진행상태
        for(int i = 0; i <= attacks[attacks.length-1][0]; i++) { // 마지막 공격까지 반복
            if(attacks[atkSts][0] == i) { // 공격 받는 턴일경우
                answer -= attacks[atkSts][1];
                con = 0; // 붕대 연속성공 초기화
                atkSts++;
            } else { // 공격 받는 턴이 아닌경우
                answer += bandage[1]; // 붕대감기
                con += 1;
                if(bandage[0] == con) { // 시전 시간만큼 연속성공
                    answer += bandage[2];
                    con = 0;
                }
            }
            if(answer > health) {
                answer = health;
            }
            if(answer <= 0) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}