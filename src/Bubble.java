public class Bubble {

    public static void main(String[] args) {
        int[] arr = {10, 9, 1, 3, 6, 2, 5, 4, 8, 7};

        bubble(arr);

        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
