import java.util.Scanner;

public class practice_Day2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String Name = sc.nextLine();
        if(Name.length() > 5 ){
            System.out.println("Greater than 5");
        }
        else if(Name.length() < 5){
            System.out.println("Less than 5");
        }
        else if(Name.length() == 5){
            System.out.println("Equal to 5");
        }
        sc.close();
    }
}
