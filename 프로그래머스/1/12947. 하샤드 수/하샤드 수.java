class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        String strX = "" + x;
        String[] arr = strX.split("");
		for(int i=0;i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        if(x % sum == 0) {
            answer = true;
        }
        return answer;
    }
}