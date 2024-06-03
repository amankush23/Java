public class String_data_type_methods {
    public static void main(String[] args){

        //String to Integer Conversion
        String Str = "123";
        int number = Integer.parseInt(Str);
        System.out.println(number);

        //Integer to String Conversion
        int a = 32345;
        String str = Integer.toString(a);
        System.out.println(str);
        System.out.print("The length of the String "+str+" is: "+ str.length());

    }
}
