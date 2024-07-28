// 4.4 - https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class LCMGCD {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solve ob = new Solve();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solve {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] ans = new Long[2];
        Long originalA = A;
        Long originalB = B;
        Long gcd;
        Long lcm;

        //gcd
        while (A > 0 && B > 0) {
            if (A > B) {
                A = A % B;
            } else {
                B = B % A;
            }
        }

        if (A == 0) {
            gcd = B;
        } else {
            gcd = A;
        }

        // better gcd (swaps numbers if A < B)
        // while (B != 0) {
        //     Long temp = B;
        //     B = A % B;
        //     A = temp;
        // }
        // Long gcd = A;

        //lcm

        lcm = (originalA * originalB)/ gcd;

        ans[0] = lcm;
        ans[1] = gcd;
        return ans;
    }
};