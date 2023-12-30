class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ", -1);
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list[i].length(); j++) {
                if(j % 2 == 0) {
                    answer += toUpperChar(list[i].charAt(j));
                } else {
                    answer += toLowerChar(list[i].charAt(j));
                }
            }
            if(i != (list.length - 1)) {
                answer += " ";
            }
        }
        return answer;
    }
    public char toUpperChar(char c) {
        if(c >= 97 && c <= 122) { // 소문자라면
	        c = (char)(c - 32);
        }
        return c;
    }
    public char toLowerChar(char c) {
        if(c >= 65 && c <= 90) { // 대문자라면
	        c = (char)(c + 32);
        }
        return c;
    }
}