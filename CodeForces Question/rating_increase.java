import java.util.Scanner;
public class rating_increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline
        
        for (int i = 0; i < t; i++) {
            String ab = sc.nextLine(); // Input string
            
            boolean found = false;
            
            // Try every possible split point
            for (int j = 1; j < ab.length(); j++) {
                String a = ab.substring(0, j); // First part
                String b = ab.substring(j);    // Second part
                
                // Check if both are valid numbers and b > a
                if (isValid(a) && isValid(b) && Integer.parseInt(b) > Integer.parseInt(a)) {
                    System.out.println(a + " " + b);
                    found = true;
                    break;
                }
            }
            
            // If no valid split is found
            if (!found) {
                System.out.println("-1");
            }
        }
        
        sc.close();
    }
    
    // Check if the number is valid (no leading zeros unless it's "0")
    public static boolean isValid(String s) {
        if (s.length() > 1 && s.startsWith("0")) {
            return false; // Invalid if it has leading zeros
        }
        return true;
    }
}


