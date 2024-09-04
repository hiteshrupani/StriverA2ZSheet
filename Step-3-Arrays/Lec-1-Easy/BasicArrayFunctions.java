import java.util.Scanner;

public class BasicArrayFunctions {
    public static int[] getIntArrayFromUserInput() {
        Scanner sc = new Scanner(System.in);

        String[] userInput = sc.nextLine().split(" ");
        int[] arr = new int[userInput.length];
        for (int i = 0; i < userInput.length; i++) {
            arr[i] = Integer.parseInt(userInput[i]);
        }

        sc.close();

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
