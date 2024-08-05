// 1.2 - https://www.geeksforgeeks.org/problems/bubble-sort/1

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
//import java.io.*;

class BubbleSort
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
            Solution12.bubbleSort(arr,n);

            //calling printArray() method
            printArray(arr);

            t--;
        }
    }

}
// } Driver Code Ends

//User function Template for Java

class Solution12
{
    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int[] arr, int n)
    {
        // Rounds
        for (int i = n-1; i >= 1; i--) {
            // for best case(already sorted)
            boolean didSwap = false;

            // Pushing max elem to last
            for (int j = 0; j <= i-1; j++) {

                // comparing adjacent elem
                if (arr[j] > arr[j+1]) {

                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }

            // already sorted check
            if (!didSwap) {
                break;
            }
        }
    }
}
