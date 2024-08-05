import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt(); //size of the array
        sc.nextLine();

        // input array (pre-computation can be done here as well)
        String[] userInput = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(userInput[i]);
        }

        // pre-compute
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // iterating over map
        for (Map.Entry<Integer, Integer> it: map.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }

        // output
        int q = sc.nextInt();
        while(q-- > 0) {
            int key = sc.nextInt();
            // fetching
            System.out.println(map.get(key));
        }

        sc.close();
    }
}