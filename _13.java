import java.util.*;

public class _13 {

    // Print subsets
    static List<String> list;
    private static void solve(String ip, String curr,int idx){

        if(idx == ip.length()){
            if(!list.contains(curr)){
                list.add(curr);
            }

//            System.out.println(curr);
            return;
        }

        solve(ip, curr, idx + 1);
        solve(ip, curr + ip.charAt(idx), idx + 1);


    }

    public static void main(String[] args) {

        String ip = "aab";
        list = new ArrayList<>();
        solve(ip, "", 0);
        Collections.sort(list);
        System.out.println(list);
    }
}
