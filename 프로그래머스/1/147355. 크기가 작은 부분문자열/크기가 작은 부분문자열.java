class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLeg = p.length();
        Long longP = Long.parseLong(p);
        for(int i = 0; i < (t.length() - pLeg + 1); i++) {
            if(Long.parseLong(t.substring(i, (i+pLeg))) <= longP) {
                answer++;
            }
        }
        return answer;
    }
}