import java.util.Scanner;

public class checksum {
    public static void CheckSum(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] results = new String[n];
        
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            results[i] = CheckSum(a, b, c);
        }
        sc.close();
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
        
    }

    public static String CheckSum(int a, int b, int c) {
        if(a + b == c || b + c == a || a + c == b) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
