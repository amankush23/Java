public class fibonacci_Series {
    public static void printfib(int a, int b, int c){
        if(c == 0 ){
            return;
        }
        int res = a + b;
        System.out.println(res);
        printfib(b, res, c - 1);

    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = 7;
        printfib(a, b, c-2);    
    }
}
