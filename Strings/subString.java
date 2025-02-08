public class subString {
    public static void main(String[] args) {
        String s = "hello";
        PrintSubString(s);
    }
    public static void PrintSubString(String s) {
        for(int i = 0 ; i < s.length(); i++){
            for(int j = i+1 ; j <= s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
