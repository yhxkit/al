public class Merge {


    public static void main(String[] args) {

        int[] arr = {1, 9, 10, 3, 6, 2, 5, 4, 8, 7};

        mergeSort(arr);
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void mergeSort(int[] arr){
        int[] tmp = new int[arr.length];

        mergeSort(arr, tmp, 0 , arr.length-1);
    }

    public static void mergeSort(int[] arr, int[] tmp, int start, int end){
        if(start<end){
            int mid = (start +end)/2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid+1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    public static void merge(int[] arr, int[] tmp, int start, int mid, int end){
        for(int i=start; i<=end; i++){
            tmp[i] = arr[i];
        }
        int p1= start;
        int p2= mid+1;
        int index =start;

        while(p1<=mid && p2<=end){
            if(tmp[p1] <= tmp[p2]){
                arr[index] = tmp[p1];
                p1++;
            }else{
                arr[index] = tmp[p2];
                p2++;
            }
            index++;
        }
        for(int i=0; i<=mid-p1; i++){
            arr[index+i] = tmp[p1+i];
        }
    }

}
