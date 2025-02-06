public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
        System.out.print(Print(n, 0, ""));
    }
    public static int Print(int n , int curr, String ans){
        if(curr == n){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr >n){
            return 0;
        }
        // Print(n, curr+1, ans+1);
        // Print(n, curr+2, ans+2);
        // Print(n, curr+3, ans+3);
        int x = 0;
        for(int i = 1 ; i <= n; i++){
            x += Print(n, curr+i, ans+i);
        }
        
        return x;
    }
}
