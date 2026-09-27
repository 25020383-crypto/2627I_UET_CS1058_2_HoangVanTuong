import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualStacks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int i1 = 0 , i2 = 0 , i3 = 0;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        List<Integer> h1 = new ArrayList<>();
        for(int i = 0 ; i < n1; i++){
            int a = sc.nextInt();
            sum1 += a;
            h1.add(a);
        }
        List<Integer> h2 = new ArrayList<>();
        for(int i = 0 ; i < n2; i++) {
            int a = sc.nextInt();
            sum2 += a;
            h2.add(a);
        }
        List<Integer> h3 = new ArrayList<>();
        for(int i = 0 ; i < n3; i++) {
            int a = sc.nextInt();
            sum3 += a;
            h3.add(a);
        }
        while(!(sum1 == sum2 && sum2 == sum3)){
            int maxHeight = Math.max(sum1, Math.max(sum2, sum3));
            if (sum1 == maxHeight) {
                sum1 -= h1.get(i1);
                i1++;
            } else if (sum2 == maxHeight) {
                sum2 -= h2.get(i2);
                i2++;
            } else {
                sum3 -= h3.get(i3);
                i3++;
            }
        }
        System.out.println(sum1);
    }
}
