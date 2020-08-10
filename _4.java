class _4{


    private static void solve(int i) {
        

        // base condition
        if(i == 1){
            System.out.println(1);
            return;
        }
        
        //hypothesis
        solve(i - 1);


        //induction
        System.out.println(i);

    }


    public static void main(String[] args) {
        
        int i = 9;

        solve(i);

    }
}