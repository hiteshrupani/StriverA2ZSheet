// 4.1 - https://www.geeksforgeeks.org/problems/count-digits5716/1

//{ Driver Code Starts

import java.io.*;
// import java.util.*;

public class CountDigits
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            System.out.println(Solution41.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends

class Solution41 {
    static int evenlyDivides(int N){
        int userInput = N;
        int answer = 0; // number of digits that evenly divide N

        while (userInput > 0) {
            // extracting last digit of the number
            int lastDigit = userInput % 10;

            // incrementing answer if remainder is 0
            // and to avoid dividing by 0 error
            if (lastDigit != 0 && N % lastDigit == 0){
                answer ++;
            }

            // separating the lastDigit
            userInput = userInput / 10;
        }
        return answer;
    }
}