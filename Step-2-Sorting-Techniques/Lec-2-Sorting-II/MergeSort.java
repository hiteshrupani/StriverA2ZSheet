// 2.2.1 - https://www.geeksforgeeks.org/problems/merge-sort/1

//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
    static void printArray(int[] arr)
    {
        StringBuffer sb=new StringBuffer();
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb);
    }



    public static void main(String[] args)
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while(T>0)
        {
            //taking elements count
            int n = sc.nextInt();

            //creating an array of size n
            int[] arr = new int[n];

            //adding elements to the array
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();


            Solution21 g = new Solution21();

            //calling the method mergeSort
            g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
            printArray(arr);
            T--;
        }
    }
}



// } Driver Code Ends


class Solution21
{
    void merge(int[] arr, int low, int mid, int high)
    {
        // temporary array to store sorted array
        ArrayList<Integer> temp = new ArrayList<>();

        // pointers for left and right arrays
        int left = low;
        int right = mid + 1;

        // till one of the array gets empty
        while (left <= mid && right <= high) {
            // adding smaller elem to temp
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // when left isn't empty yet
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // when right isn't empty yet
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfer temp to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }
    void mergeSort(int[] arr, int low, int high)
    {
        // base case: only one elem in the array
        if (low >= high) {
            return;
        }

        // splitting the array recursively
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        // merging the sorted arrays
        merge(arr, low, mid, high);
    }
}
