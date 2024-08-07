// 2.2 - https://www.geeksforgeeks.org/problems/bubble-sort/1

//{ Driver Code Starts

import java.util.*;
//import java.io.*;

class BubbleSortRecursive
{
    //method to print the Elements of the array
    static void printArray(int[] arr)
    {
//        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking total testcases
        int t = sc.nextInt();
        while(t>0)
        {
            //taking total elements
            int n = sc.nextInt();

            //creating a new array of length n
            int[] arr = new int[n];

            //inserting elements to the array
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }


            //calling bubbleSort() method
            Solution22.bubbleSortRecursive(arr,n);

            //calling printArray() method
            printArray(arr);

            t--;
        }
    }

}
// } Driver Code Ends

//User function Template for Java

class Solution22
{
    public static void bubbleSortRecursive(int[] arr, int n) {
        // base case: when last two elems are remaining
        if (n < 2){
            return;
        }

        // pushing the max elem to the last(right place)
        pushMaxToLast(arr, n, 0);

        // recursive call without the last elem
        bubbleSortRecursive(arr, n-1);
    }

    public static void pushMaxToLast(int[] arr, int n, int i) {
        // base case: to compare last elem and avoid out of index range err
        if (i >= n-1) {
            return;
        }

        // swapping if left elem is greater
        if (arr[i] > arr[i+1]) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        // recursive call for the next elem
        pushMaxToLast(arr, n, i+1);
    }
}
