public class Insertion {

    public static void main(String[] args) {
        int[] arr = {10, 9, 1, 3, 6, 2, 5, 4, 8, 7};

        insert(arr);
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void insert(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }

}
