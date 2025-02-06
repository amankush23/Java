public class fact_tail {
    public static void main(String[] args) {
        System.out.print(fact(5,1));
    }
    public static int fact(int n,int ans){
        if(n == 0){
            return ans;
        }
        return fact(n-1,ans*n);
    }
}
