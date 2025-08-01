import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Integer[] rank = new Integer[k];
        int temp1 = 0, count = 0;
        for(int i = 0; i < score.length; i++) {
            if(count < k) {
                rank[count++] = score[i];
                Integer[] temp = Arrays.copyOf(rank, count);
                Arrays.sort(temp, Collections.reverseOrder());
                for (int j = 0; j < count; j++) {
                    rank[j] = temp[j];
                }
            } else {
                temp1 = score[i];
                for(int j = 0; j < k; j++) {
                    if(temp1 > rank[j]) {
                        int tmp = rank[j];
                        rank[j] = temp1;
                        temp1 = tmp;
                    }
                }
            }
            answer[i] = count < k ? rank[count - 1] : rank[k - 1];
        }
        return answer;
    }
}