import java.util.Scanner;

public class table_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i = 1; i < 11; i++){
            int res = num * i;
            System.out.println(num + " * " + i +" = "+ res);
        }
        sc.close();
    }
}
