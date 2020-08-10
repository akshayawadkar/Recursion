
import java.util.*;

public class _2 {

    private static List<List<String>> solve(String ip){
        List<String> subList = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        
        helper(ip, 0, subList, result);

        return result;
    }
    
    
    private static void helper(String ip, int idx, List<String> subList, List<List<String>> result){

        if(idx == ip.length()){
            result.add(new ArrayList<>(subList));
            return;
        }
        subList.add(ip.charAt(idx) + "");
        helper(ip, idx + 1, subList, result);
        subList.remove(subList.size() - 1);
        helper(ip, idx + 1, subList, result);


    }


    public static void main(String[] args) {
        String ip = "123";

        System.out.println(solve(ip));
    }
    
}