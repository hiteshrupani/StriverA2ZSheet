// 4.6 - https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class SumOfAllDivisors
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- > 0)
        // {
            int N=sc.nextInt();
            sc.close();
            Sol ob = new Sol();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        // }
    }
}

// } Driver Code Ends


//User function Template for Java
class Sol{
    long sumOfDivisors(int N){

        // brute force approach 
        // long sum = 0;
        
        // for (int i = 1; i <= N; i++) {
        
        // finding sum of factors        
        //     for (int j = 1; j*j <= i; j++ ) {
        //         if (i % j == 0) {
        //             sum = sum + j;
                    
        //             if (i/j != j) {
        //                 sum = sum + i/j;
        //             }
        //         }
        //     }
        // }
        
        // return sum;
        
        // optimal approach
        long sum = 0;
        
        for (int i = 1; i <= N; i++) {
            sum += (N/i) * i;
        }
        
        return sum;

        /*
        The key insight is that instead of finding divisors for each number, we count how many times each number appears as a divisor in the range 1 to N.
        For any number i from 1 to N, it will be a divisor of N/i numbers in the range 1 to N.
        The loop iterates from i = 1 to N:

        For each i, (N/i) gives the count of numbers in the range 1 to N that have i as a divisor.
        We multiply this count by i itself to get the sum of all occurrences of i as a divisor.
        This product (N/i * i) is added to the total sum.


        Let's break it down with an example, say N = 12:

        When i = 1: 1 is a divisor of all 12 numbers, so we add 12 * 1 = 12 to sum
        When i = 2: 2 is a divisor of 6 numbers, so we add 6 * 2 = 12 to sum
        When i = 3: 3 is a divisor of 4 numbers, so we add 4 * 3 = 12 to sum
        When i = 4: 4 is a divisor of 3 numbers, so we add 3 * 4 = 12 to sum
        ...and so on.


        This method counts each divisor exactly once for each number it divides, thus giving us the correct sum of all divisors for all numbers from 1 to N.
        The use of integer division (N/i) ensures that we get the correct count of numbers divisible by i.
         */
    }
}