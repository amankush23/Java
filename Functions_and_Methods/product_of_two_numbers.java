import java.util.Scanner;
public class product_of_two_numbers {
    public static int ProductOfNums(int a, int b){
        return a*b;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();
        int c = ProductOfNums(x, y);
        System.out.print("The Product of the Numbers : "+c);
        
    }
}

