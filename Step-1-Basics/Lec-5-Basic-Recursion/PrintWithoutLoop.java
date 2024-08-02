// 5.1 - https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

// import java.io.*;
import java.util.*;
class PrintWithoutLoop {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc =new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    //creating an object of class Print
		    Solution51 obj=new Solution51();
		    int N;
		    
		    //input N
		    N=sc.nextInt();
		    
		    //calling printNos() methdo
		    //of class Print
		    obj.printNos(N);
		    System.out.println();
		    
		}
        sc.close();
		
	}
}


// } Driver Code Ends


//User function Template for Java



class Solution51
{
    
  public void printNos(int N)
    {
        
        // checking for contstraints
		// base condition
        if (1 > N || N > 1000) {
            return;
        }
        
		// recursive call
        printNos(N-1);
        
		// printing with whitespace at the end
        System.out.print(N + " ");
    }
}

