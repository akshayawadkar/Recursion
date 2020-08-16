

// Tower of Hanoi

public class _11{

    private  static void solve(char src, char dest, char helper, int n){

         if(n == 1){
             System.out.println("Moving " + n + " from " + src + " to " + dest);
             return;
         }
         solve(src, helper, dest, n - 1);
         System.out.println("Moving " + n + " from " + src + " to " + dest);
         solve(helper, dest, src, n - 1);

    }

    public static void main(String[] args) {

        int n = 3;
        char s = 's';
        char d = 'd';
        char h = 'h';
        solve(s, d, h, n);
    }


}

/*
Moving 1 from 1 to 3
Moving 2 from 1 to 2
Moving 1 from 3 to 2
Moving 3 from 1 to 3
Moving 1 from 2 to 1
Moving 2 from 2 to 3
Moving 1 from 1 to 3
 */