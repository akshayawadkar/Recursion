import java.util.Arrays;

public class _5 {


     

    private static int[] solve(int[] arr){
        
        if(arr.length == 1){
            return arr;
        }

        int[] left = solve(Arrays.copyOfRange(arr, 0, arr.length - 1));
        int[] right = solve(Arrays.copyOfRange(arr, arr.length - 1, arr.length));

        int[] result = merger(left, right);
        
        return result;
    }

    private static int[] merger(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length){
            result[k++] = arr1[i++];
        }

        while(j < arr2.length){
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,5,0,2};
      
        System.out.println(Arrays.toString( solve(arr)));
    }
    
}