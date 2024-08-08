// 2.3 -  https://www.geeksforgeeks.org/problems/insertion-sort/0?category%5B%5D=Algorithms&page=1&query=category%5B%5DAlgorithmspage1

//{ Driver Code Starts
import java.util.*;
//import java.lang.Math;

class Sorting
{
    static void printArray(int[] arr, int size)
    {
        int i;
        for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();

            new Solution23().insertionSortRecursive(a,n);
            printArray(a,n);

            t--;
        }

    }
}
// } Driver Code Ends


class Solution23
{
    static void insert(int[] arr, int i)
    {
        // checking if left elem is bigger
//        while (i > 0 && arr[i-1] > arr[i]) {
//            // swapping with left elem
//            int temp = arr[i];
//            arr[i] = arr[i-1];
//            arr[i-1] = temp;
//
//            i--;
//        }

        // base case: till i reaches first elem
        if (i <= 0) {
            return;
        }

        // swap elem if left is bigger
        if (arr[i] < arr[i-1]) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;

            // check for new left elem
            insert(arr, i-1);
        }
    }

    //Function to sort the array using insertion sort algorithm.
    public void insertionSortRecursive(int[] arr, int n)
    {
        // check for each elem
        for (int i = 1; i <= n-1; i++) {
            insert(arr, i);
        }
    }
}