import java.util.Scanner;

class Array_demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] =sc.nextInt();
            // int[] ar = {1,2,3,4,5};
            // int[] ar1 = new int[]{2,3,4,5,3};
        }
        Display(arr);

    }
    public static void Display(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

