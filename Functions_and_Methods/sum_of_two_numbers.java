import java.util.Scanner;
class sum_of_two_numbers{
    public static void SumOfNums(int a, int b){
        int c = a + b;
        System.out.print("The Sum of the Numbers : "+c);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();
        SumOfNums(x, y);
    }
}

