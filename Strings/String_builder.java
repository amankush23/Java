public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        //  StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
        sb.append("jhhkkl");
        sb.append(7);
        sb.append(true);
        sb.append('a');
        System.out.println(sb.length());
        System.out.println(sb.delete(1,3));
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        System.out.println(sb.substring(0,4));
        System.out.println(sb.reverse());
        //It grows with 2*(old)+2
        
        // String s = sb.toString();
        // String str = "sdlk";
        // sb.append(str);
        
        
    }
}
