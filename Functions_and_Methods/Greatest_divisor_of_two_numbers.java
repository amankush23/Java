import java.util.Scanner;

public class Greatest_divisor_of_two_numbers {
    public static int greatestDivisor(int n, int m){
        int greatestdiv = 1;
        for(int i = 1; i <= Math.min(n, m); i++){
            if(n % i == 0 && m % i == 0){
                greatestdiv = i;
            }
        }
        return greatestdiv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = greatestDivisor(x, y);
        System.out.print("The divisor of "+ x+"and"+y+"is: "+ c);
        sc.close();

    }
}
