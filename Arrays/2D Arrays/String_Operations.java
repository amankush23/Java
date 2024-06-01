import java.util.*;
public class String_Operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String FirstName = "Aman";
        String LastName = "kushwah";
        //concatenation Operation 
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);
        //Length of the String
        System.out.println("Length of "+FullName+" is: "+FullName.length());

        //Each Character into new line
        for(int i= 0; i < FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }
        sc.close();
    }
}
