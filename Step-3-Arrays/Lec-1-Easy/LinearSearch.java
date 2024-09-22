// 3.1.8 - https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1

//{ Driver Code Starts
import java.io.*;
import java.lang.*;

class LinearSearch {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String[] s = read.readLine().trim().split("\\s+");

            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);

            int[] arr = new int[n];

            String[] st = read.readLine().trim().split("\\s+");

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st[i]);
            }

            Solution318 obj = new Solution318();

            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}
// } Driver Code Ends

class Solution318 {
    public int searchInSorted(int[] arr, int N, int K) {
        // Your code here
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) return 1;
        }

        return -1;
    }
}