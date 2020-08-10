package Strings;
class _1_ReverseStringUsingRecursion{

    private static String solve(String ip){

        if(ip.length() == 0){
            return "";
        }

        String tmp = ip.substring(ip.length() - 1, ip.length());

        String result = tmp + solve(ip.substring(0, ip.length() - 1));
        return result;
    }

    public static void main(String[] args) {
        
       String ip = "abcde";
       System.out.println(solve(ip));
 
    }
}

/**
 * 
 * 
 * abc 
 * ab   c
 * a    b   c  
 *
 * 
 * 
 */