class Solution {
    public int solution(int n) {
        if (n <= 0) {
            return 0;
        }
        int sum = 0;
        if (n == 1) {
            return 1;
        }
        sum = 1;
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += (n / i);
                }
            }
        }
        sum += n;
        return sum;
    }
}