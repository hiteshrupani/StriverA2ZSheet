// 3.1.10 - https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = BasicArrayFunctions.getIntArrayFromUserInput();

        Solution3110 solution = new Solution3110();
        System.out.println(solution.missingNumberOptimalBest(arr));

    }
}

class Solution3110 {
    // brute force: linear search
    public int missingNumberBrute(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return i;
            }
        }

        return -1;
    }

    // better: hashing
    public int missingNumberBetter(int[] arr) {
        int n = arr.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] = 1;
        }

        for (int i = 0; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    // optimal: sum
    public int missingNumberOptimal(int[] arr) {
        int n = arr.length;

        int sum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        return sum - actualSum;
    }

    // optimal (best): xor
    public int missingNumberOptimalBest(int[] arr) {
        int n = arr.length;

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n; i++) {
            xor2 ^= arr[i];
            xor1 ^= (i + 1);
        }

        return xor1 ^ xor2;
    }
}