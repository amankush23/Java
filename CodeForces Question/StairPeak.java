import java.util.Scanner;
public class StairPeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] results = new String[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            results[i] = stairPeak(a, b, c);
        }
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
}

        
        sc.close();
    }

    public static String stairPeak(int a, int b, int c) {
        if (a < b && b < c) {
            return "STAIR";
        } else if (a < b && b > c) {
            return "PEAK";
        } else {
            return "NONE";
        }
    }
}