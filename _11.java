import java.util.*;
//Burst Ballons MCM Pattern
class _11{

    private static int solve(int[] arr){

        int[] newArr = new int[arr.length + 2];
        newArr[0] = 1;
        newArr[newArr.length - 1] = 1;
        for(int i = 0; i < arr.length; i++){
            newArr[i + 1] = arr[i];
        }
        int result = helper(newArr, 1, newArr.length - 2);
        return result;

    }

    private static int helper(int[] arr, int start, int end){
        
        if(start > end){
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for(int k = start; k <= end; k++){
            
            int tmp = helper(arr, start, k - 1)
                        + helper(arr, k + 1, end)
                        + (arr[start - 1] * arr[k] * arr[end + 1]);
            
            max = Math.max(max, tmp);
        }

        return max;
    }


    public static void main(String[] args) {
        int[] arr = {3,1,5,8};
        System.out.println(solve(arr));
    }
}