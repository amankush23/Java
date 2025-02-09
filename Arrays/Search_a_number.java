import java.util.*;
public class Search_a_number {

    public static void findNumber(int[] arr, int key){
        for(int i = 0; i <=arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {2,3,4,1,7,9,8};
        int item = 9;
        findNumber(arr, item);
        sc.close();
    }
}
