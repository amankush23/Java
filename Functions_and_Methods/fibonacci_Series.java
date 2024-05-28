import java.util.Scanner;
public class fibonacci_Series {
    public static int calculate_fibonacci(int n){
        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a+" "+b);
        for(int i = 2; i <= n; i++){
            temp = a+b;
            a = b;
            b = temp;
            System.out.print(" "+temp);
        }
        System.out.println();
        return temp;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        calculate_fibonacci(x);
        sc.close();
    }
}