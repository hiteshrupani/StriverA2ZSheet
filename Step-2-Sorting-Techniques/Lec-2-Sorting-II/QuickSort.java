// 2.4 - https://www.geeksforgeeks.org/problems/quick-sort/1

//{ Driver Code Starts
import java.util.*;
class QuickSort
{
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();


            Solution24.quickSort(arr,0,n-1);
            printArray(arr);
            T--;
        }
    } }
// } Driver Code Ends


class Solution24
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int[] arr, int low, int high)
    {
        // base case: when there's only one index/number left
        if (low < high) {
            // getting correct index of pivot
            int pivot = partition(arr, low, high);

            // smaller
            quickSort(arr, low, pivot - 1);
            //larger
            quickSort(arr, pivot + 1, high);
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        // to stop when 'j' and 'i' have crossed each other
        while (i < j) {
            // to stop when greater number is found
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            // to stop when smaller number is found
            while (arr[j] > pivot && j > low) {
                j--;
            }

            // 'i' hasn't crossed 'j'
            if (i < j) {
                // swap 'i' and 'j'
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // when 'j' and 'i' have crossed each other
        // swap 'j' and pivot
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        // return pivot's index
        return j;
    }
}
