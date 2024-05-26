import java.util.Scanner;

class Solid_Ractangle_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner ak = new Scanner(System.in);
        int m = ak.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        ak.close();

    }
}