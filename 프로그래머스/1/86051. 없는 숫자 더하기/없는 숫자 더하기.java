import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i <= 9; i++){
            if(!contains(numbers, i)) {
                answer += i;
            }
        }
        return answer;
    }
    public boolean contains(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
            }
        }
        return found;
    }
}