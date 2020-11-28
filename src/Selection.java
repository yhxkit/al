public class Selection {

    public static void main(String[] args) {
        int[] arr = {10, 9, 1, 3, 6, 2, 5, 4, 8, 7};

        select(arr);

        for (int n : arr) {
            System.out.println(n);
        }
    }


    public static void select(int[] arr) {

        int min = 0;
        int index = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            min = 999;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }


}
