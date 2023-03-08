
public class Prep2 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        System.out.println(removeduplicates(arr));
    }

    public static int removeduplicates(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }

            arr[count] = arr[i];
            count++;
        }
        return count;
    }
}
