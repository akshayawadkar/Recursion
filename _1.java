public class _1 {


    public static void solve(String ip, String curr, int idx){

        if(idx == ip.length()){
            System.out.println(curr);
            return;
        }
        solve(ip, curr + ip.charAt(idx), idx + 1);
        solve(ip, curr, idx + 1);
    }

    


    public static void main(String[] args) {
        String ip = "123";

        solve(ip, "", 0);
    }
    
}