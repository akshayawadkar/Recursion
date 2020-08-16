public class _12 {

    // Print subsets

    private static void solve(String ip, String curr,int idx){

        if(idx == ip.length()){
            System.out.println(curr);
            return;
        }

        solve(ip, curr, idx + 1);
        solve(ip, curr + ip.charAt(idx), idx + 1);


    }

    public static void main(String[] args) {

        String ip = "ab";
        solve(ip, "", 0);

    }
}
