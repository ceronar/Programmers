class Solution {
    public int solution(int n) {
        // n까지의 소수를 구하고 (n - 소수 - 1) 
        int answer = 0;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {answer++;}
            count = 0;
        }
        answer = n - answer - 1;
        return answer;
    }
}