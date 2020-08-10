import java.util.Stack;

public class _9 {

     private static void solve(Stack<Integer> stack){

        int k = (stack.size() / 2) + 1;

        solve(stack, k);
    }

    private static void solve(Stack<Integer> stack, int k){

        if(k == 1){
            stack.pop();
            return;
        }

        int tmp = stack.pop();

        solve(stack, k - 1);

        stack.push(tmp);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        solve(stack);

        System.out.println(stack);
    }

 
    
}