// 3.1.12 - https://leetcode.com/problems/single-number/ 

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = BasicArrayFunctions.getIntArrayFromUserInput();

        Solution3112 solution = new Solution3112();
        System.out.println(solution.singleNumberOptimal(arr));
    }
}

class Solution3112 {

    public int singleNumberBrute(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int count = 0;

            // to count occurrences
            for (int j = 0; j < n; j++) {
                if (nums[j] == num) count++;
            }

            if (count == 1) return num;
        }

        return -1;
    }

    public int singleNumberBetter(int[] nums) {
        int n = nums.length;

        // getting max element
        int maxi = nums[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        // hashing
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        // finding the single number
        for(int i = 0; i < n; i++) {
            if (hash[nums[i]] == 1) return nums[i];
        }

        return -1;
    }

    public int singleNumberOptimal(int[] nums) {
        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }

        return xor;
    }
}