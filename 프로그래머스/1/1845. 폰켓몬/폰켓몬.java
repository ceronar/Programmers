import java.util.*;

class Solution {
    public int solution(int[] nums) {
        return Math.min(nums.length/2, Arrays.stream(nums).distinct().toArray().length);
    }
}