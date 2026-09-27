import java.util.Stack;
public class Balanced {
    public static String isBalance(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '('){
                stack.push(')');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if( c == '{'){
                stack.push('}');
            }
            else{
                if(stack.isEmpty() || stack.pop() != c ){
                    return "NO";
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
    public static void main(String[] args){
        String name1 = "[({})]";
        String name2 = "{[(]}";
        Balanced result = new Balanced();
        System.out.println(result.isBalance(name1));
        System.out.println(result.isBalance(name2));
    }
}
