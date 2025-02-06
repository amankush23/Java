import java.util.*;
public class combination_sum {
    public static void main(String[] args) {
        int[] coin = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combination(coin, target, ll, 0,ans);
        System.out.println(ans);
    }
    public static void Combination(int[] coin, int ammount,List<Integer> ll, int idx,List<List<Integer>> ans){
        if(ammount == 0){
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i = idx; i < coin.length;i++){
            if(ammount >= coin[i]){
                ll.add(coin[i]);
                Combination(coin, ammount-coin[i], ll, i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
