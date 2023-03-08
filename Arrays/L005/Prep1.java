
import java.util.*;

public class Prep1 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 10, 5, 4, 20, 20 };
        int n = arr.length;
        countfreq(arr, n);
    }

    public static void countfreq(int arr[], int n) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (hm.containsKey(arr[i])) {

                hm.put(arr[i], hm.get(arr[i]) + 1);

            } else {
                hm.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
