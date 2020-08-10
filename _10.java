import java.util.Stack;

class _10{


    private static void solve(Stack<Integer> stack){
        if(stack.size() == 0){
            return;
        }

        int tmp = stack.pop();
        solve(stack);
        // stack.insertElementAt(0, tmp);
        insert(stack, tmp);
    }

    private static void insert(Stack<Integer> stack, int val){
    
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }

        int tmp = stack.pop();
        insert(stack, val);
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