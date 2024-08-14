// 3.1.2 - https://www.geeksforgeeks.org/problems/second-largest3735/1

//{ Driver Code Starts
// Initial Template for Java
import java.util.*;

public class SecondLargestElement {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution312 ob = new Solution312();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution312 {
    public int print2largest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (largest == secondLargest) {
            return -1;
        } else {
            return secondLargest;
        }
    }
}