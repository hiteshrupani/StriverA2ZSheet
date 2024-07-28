// 4.5

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(Solution.isArmstrong(x));


    }
}

class Solution {

    static boolean isArmstrong(int x) {
        double sum = 0;
        int dup = x;
        int length = String.valueOf(x).length();

        while (x > 0) {
            // extracting digits
            int lastDigit = x % 10;
            x = x / 10;

            // adding digits with exponent of length to sum
            sum = sum + Math.pow(Double.valueOf(lastDigit),Double.valueOf(length));
        }

        return sum == dup;
    }
}