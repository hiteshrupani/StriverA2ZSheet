// 3.1.6 - https://leetcode.com/problems/rotate-array/

class RotateArray {
    public static void main(String[] args) {
        int[] arr = BasicArrayFunctions.getIntArrayFromUserInput();

        Solution316Brute solution = new Solution316Brute();
        Solution316Optimal solution1 = new Solution316Optimal();
        solution1.rotateRight(arr, 2);

        BasicArrayFunctions.printArray(arr);
    }
}

// Brute Force
class Solution316Brute {
    public void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];

        // extracting elems to be rotated i.e. first k elems
//        for (int i = 0; i < k; i++) {
//            temp[i] = arr[i];
//        }
        System.arraycopy(arr, 0, temp, 0, k);

        // shifting the remaining elems
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }

        // putting back temp
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
    }

    public void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // remaining elems
        int[] temp = new int[n - k];

        // extracting remaining elems
        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[i];
        }

        // shifting the elems to be rotated
        for (int i = 0; i < k; i++) {
            arr[i] = arr[n - k + i];
        }

        // putting back temp
        for (int i = k; i < n; i++) {
            arr[i] = temp[i - k];
        }
    }
}

class Solution316Optimal {
    public void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0 , n - 1);
    }

    public void reverse(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        // swap(array[left], array[right]);
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        reverse(array, left+1, right-1);
    }
}