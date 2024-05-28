import java.util.Scanner;

class Print_my_Name{
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String Name = sc.next();
        printMyName(Name);
    }
}