// 3.1.11 - https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = BasicArrayFunctions.getIntArrayFromUserInput();

        Solution3111 solution = new Solution3111();
        System.out.println(solution.findMaxConsecutiveOnes(arr));
    }
}

class Solution3111 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return Math.max(max, count);
    }
}