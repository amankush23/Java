import java.util.*;
public class index_of_x_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int number[] = new int[size];
        
        //This is for INput
        for(int i = 0 ; i < size; i++){
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the number which index to be found x: ");
        int x = sc.nextInt();
        //This is for Output
    for(int i = 0 ; i < number.length; i++){
        if(number[i] == x){
            System.out.print("x is found at the index:"+ i);
        }
    }
    sc.close();
}
}

