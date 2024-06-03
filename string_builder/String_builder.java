public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Amankushwah");
        System.out.println(sb.charAt(0));

        //setcharAT
        sb.setCharAt(1, 'M');
        System.out.println(sb);

        //Inserting
        sb.insert(4, 'A');
        System.out.println(sb);
        
        //appending
        sb.append(" Hello");
        System.out.println(sb);


        //deleting
        sb.delete(3,7);
        System.out.println(sb);


    }
}
