class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int count = 0;
        char temp = ' ';
        for(int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            while(true) {
                if(temp == 'z') {
                    temp = 'a';
                } else {
                    temp = (char)((int)temp + 1);
                }
                if(!skip.contains(temp+"")) {
                    count++;
                }
                if(count == index) {
                    count = 0;
                    break;
                }
            }
            answer += temp;
        }
        return answer;
    }
}