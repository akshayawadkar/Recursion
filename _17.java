public class _17 {
    //generate ();

    private  static void solve(int n){
        solve(n, n, "");
    }

    private static void solve(int left, int right, String curr){
        if(right == 0){
            System.out.println(curr);
            return;
        }

        if(left > 0 ){
            solve(left - 1, right, curr + "(");
        }

        if(right > left){
            solve(left, right - 1, curr + ")");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n);
    }
}
