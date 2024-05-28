import java.util.Scanner;

public class Factorial_of_Number {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int f = factorial(x);
        System.out.print("Factorial of the number : "+ f);
        sc.close()
    }
}
