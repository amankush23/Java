public class Coin_head_tail {
    public static void main(String[] args) {
        int n = 3;
        coinToss(n,"");
    }
    public static void coinToss(int n , String ans){
        if (n == 0) {
            System.out.println(ans);
            return;
        } 
        coinToss(n - 1 , ans + "H");
        coinToss(n-1, ans+"T");
    }
}
