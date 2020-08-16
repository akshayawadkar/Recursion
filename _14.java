class _14{


    private static void solve(String ip){

        helper(ip, "a", 1);

    }

    private  static void helper(String ip, String curr, int idx){
        if(idx == ip.length()){
            System.out.println(curr);
            return;
        }

        helper(ip, curr + ip.charAt(idx), idx + 1);
        helper(ip, curr + ' ' + ip.charAt(idx), idx + 1);
    }


    public static void main(String[] args) {

        String ip = "abc";
        solve(ip);

    }
}