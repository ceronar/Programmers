class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;
        while((n/a)!=0) {
            answer += b*(n / a);
            remain = n % a;
            n = b * (n / a);
            n += remain;
        }
        return answer;
    }
}