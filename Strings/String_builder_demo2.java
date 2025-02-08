public class String_builder_demo2 {
    public static void main(String[] args) {
        StringBuilder_demo();
    }
    public static void String_Demo(){
        String s = "";
        for(int i = 0 ; i < 10000;i++){
            s=s+i;
        }
        System.out.println(s);
    }
    public static void StringBuilder_demo(){
        StringBuilder sb = new StringBuilder("Hello");
        for(int i = 0 ; i < 10000; i++){
            sb = sb.append(i);
        }
        System.out.println(sb);
    }
}
