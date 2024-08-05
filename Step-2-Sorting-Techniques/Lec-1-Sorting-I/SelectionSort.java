// 1.1 - https://www.geeksforgeeks.org/problems/selection-sort/1

//{ Driver Code Starts
import java.util.*;

class SelectionSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            Solution11 obj = new Solution11();
            obj.selectionSort(arr, n);

            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            t--;
        }

    }
}

// } Driver Code Ends


class Solution11
{
    void select(int arr[], int i)
    {
        // code here such that selectionSort() sorts arr[]
        selectionSort(arr, i);
    }

    void selectionSort(int arr[], int n)
    {
        //code here
        for (int i = 0; i <= n-2; i++) {
            // assigning first index as min
            int min = i;

            // getting index for min in remaining array
            for (int j = i; j <= n-1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swapping min
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}