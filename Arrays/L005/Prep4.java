public class Prep4 {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 45, 56, 6, 1, 2, 7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

}
