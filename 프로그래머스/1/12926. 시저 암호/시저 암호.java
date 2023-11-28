import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c : s.toCharArray()){
            if(c == ' ') {
                answer += c;
            } else {
                int ic = (int)c;
                for(int i = 0; i < n; i++) {
                    if(ic == 122) {
                        ic = 97;
                    } else if(ic == 90){
                        ic = 65;
                    } else {
                        ic++;
                    }
                }
                answer += (char)ic;
            }
        }
        return answer;
    }
}