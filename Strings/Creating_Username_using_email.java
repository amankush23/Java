import java.util.*;
public class Creating_Username_using_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email id: ");
        String email = sc.next();
        String username = "";
        System.out.println();

        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                username += email.charAt(i);
            }
        }
        System.out.print("username is: "+username);
        sc.close();

    }
}
