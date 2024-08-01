// 5.8 https://leetcode.com/problems/valid-palindrome/description/

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // input elements of array in single line
        String input = sc.nextLine();
        sc.close();

        Solution58 obj = new Solution58();
        boolean answer = obj.isPalindrome(input);
        System.out.println(answer);
    }
}

class Solution58 {
    public boolean isPalindrome(String s) {
        // converting input string to alphanumeric characters
        String processedInput = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // converting processedInput to character array
        char[] inputArray = processedInput.toCharArray();

        return checkPalindrome(0, inputArray);
    }

    boolean checkPalindrome(int pointer, char[] inputString) {
        // storing array length
        int n = inputString.length;
        
        // true if pointer crosses or reaches middle of the array
        if (pointer >= n/2) {
            return true;
        }

        // false if pointer value doesn't match
        if (inputString[pointer] != inputString[n-pointer-1]) {
            return false;
        }

        // recursive call for incremented pointer
        return checkPalindrome(++pointer, inputString);
    }
}
