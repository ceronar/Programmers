import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(list.get(count) != arr[i]) {
                list.add(arr[i]);
                count++;
            }
        }
        int[] answer = new int[list.size()];
        int size = 0;
        for(int temp : list) {
            answer[size++] = temp;
        }
        return answer;
    }
}