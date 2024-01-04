class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == 'p' || temp == 'P') {
                pCount++;
            } else if(temp == 'y' || temp == 'Y') {
                yCount++;
            }
        }
        if(pCount == yCount) {
            answer = true;
        }
        return answer;
    }
}