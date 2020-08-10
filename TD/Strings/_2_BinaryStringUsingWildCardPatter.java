package Strings;
class _2_BinaryStringUsingWildCardPatter{


    private static void solve(char[] arr){   
        solve(arr, 0);
    }

    private static void solve(char[] arr, int idx){

        if(idx == arr.length){
            System.out.println(arr);
            return;
        }

        if(arr[idx] == '?'){

            for(char i = '0'; i <= '1'; i++){
                arr[idx] = i;
                solve(arr, idx + 1);
                arr[idx] = '?';
            }
            return;

        }else{
            solve(arr, idx + 1);
        } 
    }

    public static void main(String[] args) {
        

        String ip = "1?11?00?1?";
        char[] arr = ip.toCharArray();

        solve(arr);


    }
}
