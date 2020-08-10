import java.util.*;
public class _6 {


    private static void solve(Stack<Integer> stack){
        
        if(stack.size() == 1){
            return;
        }

        int tmp = stack.pop();

        solve(stack);

        insert(stack, tmp);

        
    }

    private static void insert(Stack<Integer> stack, int tmp){

        if(stack.size() == 0 || stack.peek() == tmp){
            stack.push(tmp);
            return;
        }


        int val = stack.peek();
        stack.pop();
        insert(stack, tmp);
        stack.push(val);

    }

    public static void main(String[] args) {
        

        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(2);
        stack.push(7);
        stack.push(9);
        solve(stack);
        System.out.println(stack);
         
    }
    
}