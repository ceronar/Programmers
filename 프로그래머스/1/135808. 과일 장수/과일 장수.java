import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        // 내림차순 정렬후 m 단위로 자르고 각 상자 점수 측정후 answer에 추가
        int answer = 0;
        // 내림차순 정렬
        Integer[] descScore = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(descScore, Collections.reverseOrder());
        // 상자에 담기
        Integer[][] packedBox = new Integer[score.length / m][m];
        for(int i = 0; i < (score.length / m); i++) {
            packedBox[i] = Arrays.copyOfRange(descScore, i * m, (i+1) * m);
        }
        // 각 상자 점수 측정후 결과 추가
        for(int i = 0; i < packedBox.length; i++) {
            int min = k; // 사과의 최저점수
            for(int j = 0; j < packedBox[i].length; j++) if(packedBox[i][j] < min) min = packedBox[i][j];
            answer += min * m;
        }
        return answer;
    }
}