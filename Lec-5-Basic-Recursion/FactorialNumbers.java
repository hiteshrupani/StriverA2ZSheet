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

            Solution ob = new Solution();
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
class Solution {
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