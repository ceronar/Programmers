import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int[] newNums = Arrays.stream(nums).distinct().toArray();
        return Math.min(nums.length/2, newNums.length);
    }
}