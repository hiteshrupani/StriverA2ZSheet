// 5.3 - https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

//{ Driver Code Starts
import java.io.*;
// import java.util.*;

class PrintNTo1 {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            Solution53 obj = new Solution53();
            obj.printNos(N);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution53 {

    void printNos(int N) {
        
        // check for constraints
        // base condition
        if (N < 1 || N > 1000) {
            return;
        }
        
        System.out.print(N + " ");
        
        //recursive call
        printNos(N - 1);
    }
}