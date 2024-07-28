// 4.2 - https://leetcode.com/problems/reverse-integer/description/

import java.util.Scanner;

public class ReverseAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        Solution obj = new Solution();
        System.out.println(obj.reverse(x));

    }
}

class Solution {
    public int reverse(int x) {

        int reversed = 0;

        while (x != 0) {
            // extracting last digit
            int lastDigit = x % 10;

            // checking overflow
            
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            // max value
            // if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
            //     return 0;
            // }
            // min value
            // if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
            //     return 0;
            // }

            // adding the last digit to the reversed number
            reversed = (reversed * 10) + lastDigit;

            // separating the last digit
            x = x / 10;
        }

        return reversed;
    }
}