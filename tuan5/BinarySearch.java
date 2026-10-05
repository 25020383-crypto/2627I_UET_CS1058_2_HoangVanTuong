import java.util.List;
import java.util.Arrays;

public class BinarySearch {
    public static int Binary(int V, List<Integer> arr){
        int left = 0;
        int right = arr.size() -1 ;
        while (left <= right){
            int mid = (left + right)/2;
            if(arr.get(mid) == V){
                return mid;
            }
            else if(arr.get(mid) > V){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int V = 5;
        int result = Binary(V, arr);
        System.out.println("Vị trí tìm thấy: " + result);
    }
}

