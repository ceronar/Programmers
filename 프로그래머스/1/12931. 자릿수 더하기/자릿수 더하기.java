public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = "" + n;
        for(int i = 0; i < strN.length(); i++) {
            answer += strN.charAt(i) - '0';
        }
        return answer;
    }
}