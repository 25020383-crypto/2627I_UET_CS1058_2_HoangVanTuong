import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int q = sc.nextInt();
        String s = "";
        for(int i = 0 ; i < q; i++){
            int type = sc.nextInt();
            if(type == 1){
                String x = sc.next();
                stack.push(s);
                s += x;
            }
            else if(type == 2){
                int k = sc.nextInt();
                stack.push(s);
                s = s.substring(0, s.length() - k);
            }
            else if(type == 3){
                int k = sc.nextInt();
                System.out.println(s.charAt(k - 1));
            }
            else{
                if(!stack.isEmpty()){
                    s = stack.pop();
                }
            }
        }
    }
}
