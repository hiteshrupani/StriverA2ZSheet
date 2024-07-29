// 5.5 - https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
// import java.util.*;

class SumOfNTerms {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long sumOfSeries(long n) {
        // base condition : cube of 1 is 1
        if (n == 1) {
            return 1;
        }
        
        // calculating cube for current number
        long cube = n * n * n;
        
        // recursive call by decrementing current number
        return cube + sumOfSeries(n-1);
    }
}