import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = (n+"").split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String str = "";
        for(String a : arr) {
            str += a;
        }
        answer = Long.parseLong(str);
        return answer;
    }
}