public class string_equal {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("hel"+10+20+"dnej");
        System.out.println("hel"+(10+20)+"dnej");
        s1 = s1 + "bye";
        equals("naman", "naman");
    }
    public static boolean equals(String s1, String s2) {
        if(s1==s2){
            return true;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}