//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class FactorialNumbers {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> output = new ArrayList<Long>();
        
        // base condition
        for (long i = 1; factorial(i) <= n; i++ ) {
            output.add(factorial(i));
        }
        
        return output;
        
    }
    
    public long factorial(long n) {
        
        if (n < 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }
}