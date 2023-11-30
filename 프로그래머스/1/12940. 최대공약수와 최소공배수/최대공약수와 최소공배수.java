class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int s = (n < m)? n : m;
        int p = n * m;
        int pro = 1;
        for(int i = s; i >= 2; i--) {
            if((n%i==0)&&(m%i==0)) {
                n /= i;
                m /= i;
                pro *= i;
                i++;
            }
        }
        answer[0] = (n == 1 || m == 1)? s : pro;
        answer[1] = p / answer[0];
        return answer;
    }
}