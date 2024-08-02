// 5.2 - https://www.geeksforgeeks.org/problems/print-gfg-n-times/1

//{ Driver Code Starts
import java.io.*;
// import java.util.*;

class PrintGFGNTimes {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution52 obj = new Solution52();
            obj.printGfg(n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution52 {

    void printGfg(int N) {
        // check for constraints
        // base condition
        if (N < 1 || N > 1000) {
            return;
        }
        
        System.out.print("GFG ");
        
        // recursive call
        printGfg(N - 1);
    }
}