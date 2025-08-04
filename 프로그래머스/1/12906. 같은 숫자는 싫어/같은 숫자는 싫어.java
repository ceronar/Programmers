import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int i = 0; i < arr.length; i++){
            if(temp != arr[i]) {
                temp = arr[i];
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {       
            answer[i] = list.get(i);
        }
        return answer;
    }
}