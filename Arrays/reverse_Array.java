import java.util.*;
public class reverse_Array {

    public static void reverse(int[] arr){
            int i = 0;
            int j = arr.length-1;
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                System.out.print(arr[i]+" ");
                }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {2,3,4,1,7,9,8};
        reverse(arr);
        sc.close();
    }
}
