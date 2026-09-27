import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i = 0; i < q ; i++){
            int type = sc.nextInt();
            if(type == 1){
                int x = sc.nextInt();
                stack1.push(x);
            }
            else if(type == 2){
                if(stack2.isEmpty()){
                    while(!stack1.isEmpty()){
                        stack2.push(stack1.pop());
                    }
                }
                stack2.pop();
            }
            else if(type == 3){
                if(stack2.isEmpty()){
                    while(!stack1.isEmpty()){
                        stack2.push(stack1.pop());
                    }
                }
                System.out.println(stack2.peek());
            }
        }
    }
}
