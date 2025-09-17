import java.util.Arrays;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(true) {
            int wMax = Arrays.stream(wallet).max().getAsInt();
            int wMin = Arrays.stream(wallet).min().getAsInt();
            int bMax = Arrays.stream(bill).max().getAsInt();
            int bMin = Arrays.stream(bill).min().getAsInt();
            if(bMin<=wMin&&bMax<=wMax){
                break;
            }
            if(bill[0]>bill[1]) {
                bill[0]/=2;
            } else {
                bill[1]/=2;
            }
            answer++;
        }
        return answer;
    }
}