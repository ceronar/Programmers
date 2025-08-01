class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronun = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < pronun.length; i++) {
            for(int j = 0; j < babbling.length; j++) {
                babbling[j] = babbling[j].replaceFirst(pronun[i], "/");
            }
        }
        for(String str : babbling) {
            str = str.replace("/","");
            if(str.equals("")) {
              answer++;
            }
        }
        
        return answer;
    }
}