// 3.1.14 - https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

import java.util.*;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = BasicArrayFunctions.getIntArrayFromUserInput();
        int k = sc.nextInt();

        Solution3114 solution = new Solution3114();
        System.out.println(solution.lenOfLongSubArrBetter(arr, k));
    }
}

class Solution3114 {
    // brute
    public int lenOfLongSubArrBrute (int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0, len = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                len++;

                if (sum >= k) {
                    if (sum == k) maxLen = Math.max(len, maxLen);

                    sum = 0;
                    len = 0;
                    break;
                }
            }
        }
        return maxLen;
    }

    // better for only positives and optimal for positive and negatives (SOLUTION)
    public int lenOfLongSubArrBetter (int[] arr, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // sum till i
            // only works for positives
            //preSumMap.replace(sum, i); // store sum and index

            if (sum == k) {
                maxLen = Math.max(maxLen, i+1); // update maxLen if sum till i = k
            }

            int rem = sum - k; // to remove from sum to get k
            // if rem is present in preSumMap, then there is a subarray with sum k
            if (preSumMap.containsKey(rem)) {
                // update maxLen if subarray length is greater
                maxLen = Math.max(maxLen, i - preSumMap.get(rem));
            }

            // works with zeroes and negatives
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }

        }
        return maxLen;
    }

    // optimal for only positives
    public int lenOfLongSubArrOptimal(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int sum = arr[0];
        int maxLen = 0;

        while (i < n) {

            while (j <= i && sum > k) {
                sum -= arr[j];
                j++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, i - j + 1);
            }

            i++;
            if (i < n) sum += arr[i];
        }

        return maxLen;
    }
}