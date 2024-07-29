// 4.7 - https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

//{ Driver Code Starts
import java.io.*;
// import java.lang.*;
// import java.util.*;

class MinimumJumps {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution47().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution47 {
    public int minJumps(int[] arr, int n) {
        int jumps = 0;
        int curMax = 0, curReach = 0;
        
        for(int i = 0; i < n-1; i++) {
            
            // in case your max reach and your location is 0
            if (arr[i] == 0 && i == curMax) {
                return -1;
            }
            
            // update max reach possible if you get better option mid way
            if (i + arr[i] > curMax) {
                curMax = i + arr[i];
            }
            
            // you run out of current reach, jump and update current reach
            if (i == curReach) {
                jumps++;
                curReach = curMax;
            }
            
        }
        return jumps;
    }
}