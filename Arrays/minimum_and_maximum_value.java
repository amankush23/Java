import java.util.*;
public class minimum_and_maximum_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int number[] = new int[size];
        
        //This is for INput
        for(int i = 0 ; i < size; i++){
            number[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       
         for(int i=0; i<number.length; i++) {
             if(number[i] < min) {
                 min = number[i];
             }
             if(number[i] > max) {
                 max = number[i];
    sc.close();
}
         }
         System.out.println("Largest number is : " + max);
         System.out.println("Smallest number is : " + min);
        }
        }