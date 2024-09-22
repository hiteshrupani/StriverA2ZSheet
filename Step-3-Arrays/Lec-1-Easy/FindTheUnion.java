// 3.1.9 - https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            String[] st = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);

            int[] arr1 = new int[N];
            int[] arr2 = new int[M];

            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr1[i] = Integer.parseInt(st[i]);

            st = read.readLine().trim().split(" ");
            for(int i = 0; i< M; i++)
                arr2[i] = Integer.parseInt(st[i]);

            Solution319 obj = new Solution319();
            ArrayList<Integer> res = new ArrayList<>();
            res = obj.findUnionOptimal(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}



// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution319
{
    //Function to return a list containing the union of the two arrays.
    public ArrayList<Integer> findUnionBrute(int[] arr1, int[] arr2, int n, int m)
    {
        Set<Integer> set = new HashSet<>();

        // adding elements of arr1 to set
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        // adding elements of arr2 to set
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        ArrayList<Integer> union = new ArrayList<>(set.size());

        // adding elements of set to union
        union.addAll(set);

        return union;
    }

    public ArrayList<Integer> findUnionOptimal(int[] arr1, int[] arr2, int n, int m) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> unionArr = new ArrayList<>();

        // traversing both arrays using two pointers
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (unionArr.isEmpty() || unionArr.getLast() != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
            } else {
                if (unionArr.isEmpty() || unionArr.getLast() != arr2[j]) {
                    unionArr.add(arr2[j]);
                }
                j++;
            }
        }

        // if arr1 has more elements
        while (i < n) {
            if (unionArr.isEmpty() || unionArr.getLast() != arr1[i]) {
                unionArr.add(arr1[i]);
            }
            i++;
        }

        // if arr2 has more elements
        while (j < m) {
            if (unionArr.isEmpty() || unionArr.getLast() != arr2[j]) {
                unionArr.add(arr2[j]);
            }
            j++;
        }

        return unionArr;
    }
}



