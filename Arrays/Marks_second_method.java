import java.util.*;
public class Marks_second_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int number[] = new int[size];
    
    //This is for INput
    for(int i = 0 ; i < size; i++){
        number[i] = sc.nextInt();
    }
    //This is for Output
    System.out.println("These are the arrays elements:");
    for(int i = 0 ; i < size; i++){
        System.out.println(number[i]);
    }
    sc.close();
}
}