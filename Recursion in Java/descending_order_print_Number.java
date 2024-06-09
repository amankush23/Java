import java.util.*;
class descending_order_print_Number{
    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        int num = 7;
        printNumber(num);
    }
}