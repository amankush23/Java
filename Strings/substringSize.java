public class substringSize {
    public static void PrintSubStr(String s){
        for(int len = 1; len  <= s.length(); len++){
            for(int j = len; j <= s.length();j++){
                int i  = j - len;
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        String str =  "Codingblocks";
        PrintSubStr(str);

    }
}
