import java.util.HashMap;
import java.util.*;

public class _Permutations {

    private static void solve(String ip){

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : ip.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int idx = 0;
        char[] keys = new char[map.size()];
        int[] values = new int[map.size()];

        for(Map.Entry e : map.entrySet()){
            keys[idx] = (char) e.getKey();
            values[idx++] = (int) e.getValue();
        }

//        System.out.println(Arrays.toString(keys));
//        System.out.println(Arrays.toString(values));
        char[] result = new char[ip.length()];
        helper(keys, values, result, 0);

    }

    private  static void helper(char[] keys, int[] values, char[] result, int level){

        if(level == result.length){
            System.out.println(result);
            return;
        }

        for(int i = 0; i < keys.length; i++){
            if(values[i] == 0){
                continue;
            }

            values[i]--;
            result[level] = keys[i];
            helper(keys, values, result, level + 1);
            values[i]++;
        }

    }

    public static void main(String[] args) {
        String ip = "abcd";
        solve(ip);
    }
}

/*
ABCD
ABC D
AB CD
AB C D
A BCD
A BC D
A B CD
A B C D
 */
