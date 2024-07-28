// 4.3 - https://leetcode.com/problems/palindrome-number/description/

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(x));

    }
}

class Solution {
    public boolean isPalindrome(int x) {

        // rejecting negative number
        if (x < 0) {
            return false;
        }

        int reversed = reverse(x);

        // checking palindrome
        return reversed == x;
    }

    // method to reverse an integer
    public int reverse(int x) {
        int reverse = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE / 10) {
                return 0;
            }

            reverse = (reverse * 10) + lastDigit;
        }

        return reverse;
    }
}