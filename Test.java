class Test{


    private static int solve(int[] arr){

        int result = (int)helper(arr, 0, arr.length - 1);
        
        return result;
    }

    private static long helper(int[] arr, int currPos, int dest){

        if(currPos > dest){
            return Integer.MAX_VALUE;
        }

        if(currPos == dest){
            return 0;
        }

        long min = Integer.MAX_VALUE;

        for(int i = 1; i <= arr[currPos]; i++){
            min = Math.min(min, 1 + helper(arr, currPos + i, dest));
        }

        return min;

    }


    public static void main(String[] args) {
        
        int[] arr = {2,3,0,1,4};

        System.out.println(solve(arr));
    }
}