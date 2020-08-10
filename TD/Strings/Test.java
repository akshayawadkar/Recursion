package Strings;
public class Test{
    

    private static void solve(char[] arr, int idx){

        if(idx == arr.length){
            System.out.println(arr);
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '?'){
                for(char ch = '0'; ch <= '1'; ch++){
                    arr[i] = ch;
                    solve(arr, idx + 1);
                    arr[i] = '?';
                }
                return;
            }
        }

    }

    public static void main(String[] args) {
        char[] pattern = "1?11?00?1?".toCharArray();
		solve(pattern, 0);
    }
}