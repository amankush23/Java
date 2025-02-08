
import java.util.*;
public class lexographical_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "kunal";
        String s2 = "komal";
        System.out.println(s1.compareTo(s2));
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        // System.out.println(s3.compareTo(s4));
        System.out.println(isCompareTo(s3,s4));
    }
    public static int isCompareTo(String s1, String s2){
        if(s1 == s2){
            return 0;
        }
        int n = Math.min(s1.length(), s2.length());
        for(int i = 0 ; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
