public class string1 {
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
    }
}