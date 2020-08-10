
import java.util.*;

public class _3 {

    private static List<List<Integer>> solve(int[] ip){
        List<Integer> subList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        helper(ip, 0, subList, result);

        return result;
    }
    
    
    private static void helper(int[] ip, int idx, List<Integer> subList, List<List<Integer>> result){

        if(idx == ip.length){
            result.add(new ArrayList<>(subList));
            return;
        }
        subList.add(ip[idx]);
        helper(ip, idx + 1, subList, result);

        subList.remove(subList.size() - 1);
        helper(ip, idx + 1, subList, result);


    }


    public static void main(String[] args) {
        int[] ip = {1,2,3};

        System.out.println(solve(ip));
    }
    
}