public class wrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        System.out.println(a1);
        System.out.println(a);
        Long l = 10l;
        Character ch = 'a';
        Boolean b = true;
        Integer z = a; //autoboxing --> if primitive data is converted into non-primitive 
        //unboxing --> heap memory ke data ko stack memory me transfer kr dete h(Opposite of autoboxing)
        
        // Byte | Short | Integer | Long

        // Cashe arr of [256] size
        Integer c1 = 18;  //-128 to +127 in range
        Integer c2 = 18;  //-128 to +127 in range
        Integer c3 = 181;  //-128 to +127 in not range
        Integer c4 = 181;  //-128 to +127 in not range
        System.out.println(c1 == c2);
        System.out.println(c3 == c4);

        //Boolean
        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2);
        

        //Character
        Character x1 = 'a';
        Character y1 = 'a';
        System.out.println(x1 == y1);

        
    }

}
