class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i = 0; i < dic.length; i++) {
            if(dic[i].length() == spell.length) {
                for(int j = 0; j < spell.length; j++) {
                    if(dic[i].indexOf(spell[j]) == -1) { 
                        answer = 2;
                        break;
                    } else {
                        answer = 1;
                    }
                }
            }
        }
        if(answer == 0) answer = 2;
        return answer;
    }
}