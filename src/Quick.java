public class Quick {

    public static void main(String[] args) {
        int[] arr = {10, 9, 1, 3, 6, 2, 5, 4, 8, 7};

        quick(arr, 0, arr.length - 1);
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void quick(int[] arr, int start, int end) {
        int pivot = partition(arr, start, end);
        if (start < pivot - 1) {
            quick(arr, start, pivot - 1);
        }
        if (pivot < end) {
            quick(arr, pivot, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int p = arr[(start + end) / 2];
        while (start <= end) { //이 동안에만 포인트를 양쪽 끝에서 한칸씩 옮김
            while (arr[start] < p) {
                start++;
            }
            while (arr[end] > p) {
                end--;
            }
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
