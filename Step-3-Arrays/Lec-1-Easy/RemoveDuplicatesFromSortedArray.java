// 3.1.4 - https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.Scanner;

class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] userInput = sc.nextLine().split(" ");
        int[] arr = new int[userInput.length];
        for(int i = 0; i < userInput.length; i++) {
            arr[i] = Integer.parseInt(userInput[i]);
        }

        Solution314 solution = new Solution314();
        System.out.println(solution.removeDuplicates(arr));

        sc.close();
    }
}

class Solution314 {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            // when the number is not equal to i
            if (arr[j] != arr[i]) {
                // placing it next to i
                arr[i + 1] = arr[j];
                i++;
            }
        }

        // returning number of unique elements
        return ++i;
    }
}