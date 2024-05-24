import java.util.Scanner;

public class switch_uses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello!");
            break;
            case 2: System.out.println("Namaste!");
            break;
            case 3: System.out.println("kaise ho!");
            break;
            default: System.out.println("Invalid button");
        }
        sc.close();
    }
}
