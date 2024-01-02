class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < sizes.length; i++) { // 가로가 긴방향으로 정리
            if(sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        answer = maxValue(sizes, 0);
        answer *= maxValue(sizes, 1);
        return answer;
    }
    public int maxValue(int[][] arr, int index) {
        int value = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][index] > value) {
                value = arr[i][index];
            }
        }
        return value;
    }
}