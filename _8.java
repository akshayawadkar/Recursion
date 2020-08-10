import java.util.*;

class _8{


    private static void solve(List<Integer> list){

        if(list.size() == 1){
            return;
        }

        int tmp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        solve(list);
        insert(list, tmp);
    }

    private static void insert(List<Integer> list, int val){
        if(list.size() == 0 || list.get(list.size() - 1) <= val){
            list.add(val);
            return;
        }

        int tmp = list.remove(list.size() - 1);
        insert(list, val);
        list.add(tmp);
    }

    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        solve(list);
        System.out.println(list);
    }
}