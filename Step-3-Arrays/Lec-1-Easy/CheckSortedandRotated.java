// 3.1.3 - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

import java.util.Scanner;

class CheckSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] userInput = sc.nextLine().split(" ");
        int[] arr = new int[userInput.length];
        for(int i = 0; i < userInput.length; i++) {
            arr[i] = Integer.parseInt(userInput[i]);
        }

        Solution313 solution = new Solution313();
        System.out.println(solution.check(arr));

        sc.close();
    }
}


class Solution313 {
    public boolean check(int[] nums) {
        int rotations = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                rotations++;
            }

            // if there are unordered elems other than rotation
            if (i == 0 && nums[0] < nums[nums.length - 1]) {
                rotations++;
            }
        }

        return rotations <= 1;
    }
}