public class factorial {
    public static int printFact(int n){
        if(n == 1 || n == 0 ){
            return 1;
        }
        int fact_num1 = printFact(n - 1);
        int fact_ans = n * fact_num1;
        return fact_ans;

    }
    public static void main(String[] args){
        int num = 6;
        int ans = printFact(num);
        System.out.print(ans);
    }
}
