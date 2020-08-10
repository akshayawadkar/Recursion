package Strings;

public class _5_MobileCombinations {

    static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


    private static void solve(char[] arr){
        solve(arr, 0, "");
    }

    private static void solve(char[] arr, int idx, String curr){
        if(curr.length() == arr.length){
            System.out.println(curr);
            return;
        }

        String currKey = map[arr[idx] - '0'];

        for(int i = 0; i < currKey.length(); i++){
            String tmp = curr;
            solve(arr, idx + 1, curr + currKey.charAt(i));
            curr = tmp;
        }
    }



    public static void main(String[] args) {
        
        String ip = "23";
        char[] arr = ip.toCharArray();

        solve(arr);
    }

}