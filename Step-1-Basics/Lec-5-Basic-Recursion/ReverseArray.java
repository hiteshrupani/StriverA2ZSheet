// 5.7

// import java.io.*;
// import java.lang.*;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // input elements of array in single line
        String[] input = sc.nextLine().split(" ");

        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        sc.close();

        int[] reversed = new int[input.length];
        Solution57 obj = new Solution57();
        reversed = obj.reverse(array);

        // printing reversed array
        for (int num: reversed) {
            System.out.println(num);
        }

    }
    
}

class Solution57 {
    public int[] reverse(int[] array) {
        int[] reversed = array.clone();

        reverseSinglePointer(reversed, 0);

        return reversed;
    }

    public void reverseTwoPointer(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        // swap(array[left], array[right]);
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        reverseTwoPointer(array, left+1, right-1);
    }

    public void reverseSinglePointer(int[] array, int i) {
        int n = array.length;

        if (i >= array.length/2) {
            return;
        }

        // swap
        int temp = array[i];
        array[i] = array[n - i - 1];
        array[n - i - 1] = temp;

        reverseSinglePointer(array, i+1);
    }
}