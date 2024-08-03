// 6.2 - https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

// { Driver Code Starts
//import java.io.*;
import java.util.*;

class CountingFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size of array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read the remaining line for the array elements
        sc.nextLine(); // Consume the newline
        String[] input = sc.nextLine().split(" ");

        // Adding elements to the array
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Upper Limit of the Array
        int P = sc.nextInt();

        // Calling frequencyCount() function
        Solution62 ob = new Solution62();
        ob.frequencyCount(arr, N, P);

        // Printing array elements
        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        sc.close();
    }
}
// } Driver Code Ends

class Solution62 {
    public void frequencyCount(int[] arr, int N, int P) {
        // Initialize the hash array to store frequency of elements from 1 to N
        int[] hash = new int[P];

        // Calculating the frequency of each element in the array
        for (int i = 0; i < N; i++) {
            if (arr[i] <= P) { // We only care about elements between 1 and P
                hash[arr[i] - 1] += 1; // Incrementing frequency in the hash array
            }
        }

        // Modifying the original array to hold the frequency of elements from 1 to N
        for (int i = 0; i < N; i++) {
            if (i < P) {
                arr[i] = hash[i];
            } else {
                arr[i] = 0; // Elements beyond P should be set to 0
            }
        }
    }
}
