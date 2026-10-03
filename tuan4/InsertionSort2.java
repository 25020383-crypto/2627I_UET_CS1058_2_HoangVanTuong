import java.util.Scanner;

public class InsertionSort2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++ ){
            int j = i -1;
            int tmp = a[i];
            boolean ok = false ;
            while(j>=0 && !ok){
                if(a[j] > tmp){
                    a[j+1] = a[j];
                    j--;
                }
                else{
                    ok = true;
                    }
                }
            a[j+1] = tmp;
            for(int k = 0; k < n; k ++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
