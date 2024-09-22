// 3.1.8 - https://leetcode.com/problems/move-zeroes/description/

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = BasicArrayFunctions.getIntArrayFromUserInput();

        Solution318 solution = new Solution318();
        solution.moveZeroesToEndOptimal(arr);

        BasicArrayFunctions.printArray(arr);
    }
}

class Solution318 {
    public void moveZeroesToEndMine(int[] nums) {
        int n = nums.length;

        // worst case handling
        int zeroCount = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0) {

                zeroCount++;

                if (nums[i+1] != 0) {
                    // shift to left
                    for (int j = i+1; j < n; j++) {
                        nums[j-zeroCount] = nums[j];
                    }

                    // placing zeroes to the end
                    for (int j = 1; j <= zeroCount; j++) {
                        nums[n - j] = 0;
                    }

                    zeroCount = 0;
                }
            }
        }
    }

    public void moveZeroesToEndBrute(int[] nums) {
         int n = nums.length;
         int[] ans = new int[n];
         int index = 0;

         // placing non zeroes to temp array
         for (int i = 0; i < n; i++) {
             if (nums[i] != 0) {
                 ans[index] = nums[i];
                 index++;
             }
         }

         // transferring temp array to input array
         System.arraycopy(ans, 0, nums, 0, n);
    }

    public void moveZeroesToEndOptimal(int[] nums) {
        int n = nums.length;

        int j = -1;

        // to place j at first zero found
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // when there are no zeroes in the array
        if (j == -1) return;

        // to swap zeroes with non zeroes
        for (int i = j+1; i < n; i++) {
            if (nums[i] != 0) {
                // swapping i and j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}