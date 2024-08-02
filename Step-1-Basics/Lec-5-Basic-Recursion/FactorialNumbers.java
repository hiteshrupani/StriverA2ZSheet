// 5.6 - https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class FactorialNumbers{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            long N = sc.nextLong();

            Solution56 ob = new Solution56();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        // }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution56 {
    public ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        findFactorials(n, 1, 1, result);
        return result;
    }
    
    public void findFactorials(long n, long current, long factorial, ArrayList<Long> result) {
        // base case if factorial is larger than n
        if (factorial > n) {
            return;
        }

        // if not larger we add it to the array
        result.add(factorial);

        // recursive call to find next factorial
        findFactorials(n, current+1, factorial * (current + 1), result); // reusing last factorial here to get new factorial
    }
    
}