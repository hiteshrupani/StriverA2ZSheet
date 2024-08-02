// 5.9 - https://leetcode.com/problems/fibonacci-number/

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution59 obj = new Solution59();
        System.out.println(obj.fib(n));

    }
}

class Solution59 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}