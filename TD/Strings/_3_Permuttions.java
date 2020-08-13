package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _3_Permuttions {

    private static void solve(String ip){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : ip.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1); 
        }

        int index = 0;
        char[] keys = new char[map.size()];
        int[] values = new int[map.size()];

        for(Entry e : map.entrySet()){
            keys[index] = (char) e.getKey();
            values[index] = (int) e.getValue();
            index++;
        }
        char[] result = new char[ip.length()];
        helper(keys, values, result, 0);
    }
    
    private static void helper(char[] keys, int[] values, char[] result, int len){

        if(len == result.length){
            System.out.println(Arrays.toString(result));
            return;
        }

        for(int i = 0; i < keys.length; i++){
            if(values[i] == 0){
                continue;
            }
            values[i]--;
            result[len] = keys[i];
            helper(keys, values, result, len + 1);
            values[i]++;
        }
    }


    public static void main(String[] args) {
        
        String ip = "123";
        solve(ip);
    }
    
}