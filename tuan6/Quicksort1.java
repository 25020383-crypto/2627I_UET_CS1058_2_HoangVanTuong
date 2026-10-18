public class Quicksort1 {
    public static void quicksort(int[] arr, int low, int high){
        int pivot = arr[low];
        arr[low] = arr[high];
        arr[high] = pivot;
        int i = low-1 ;
        for (int j = 0; j < arr.length ; j++ ){
            if(arr[j] <= pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{4, 5, 3, 7, 2};
        quicksort(arr,0,4);
    }
}
