class Solution {
    public double solution(int[] arr) {
        int arrSum = 0;
        for(int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return (double)arrSum/arr.length;
    }
}