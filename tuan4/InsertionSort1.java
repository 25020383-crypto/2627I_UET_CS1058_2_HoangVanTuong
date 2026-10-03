import java.util.Scanner;
public class InsertionSort1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int q = sc.nextInt();
        int[] a = new int[q];
        for(int i = 0; i < q; i++){
            a[i] = sc.nextInt();
        }
        int j = q -2;
        int tmp = a[q-1];
        while(j >= 0 ){
            if(a[j] > tmp){
                a[j+1] = a[j];
                for (int k = 0; k < q; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
                j--;
            }
            else{
                break;
            }
        }
        a[j+1] = tmp;
        for (int k = 0; k < q; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
}
