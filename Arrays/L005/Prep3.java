import java.util.HashSet;

public class Prep3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 33333, 2, 2, 2, 5 };
        System.out.println(containsDuplicates(arr));
    }

    public static boolean containsDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
