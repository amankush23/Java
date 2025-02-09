public class largest_Value {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,7,9,8};
        System.out.println(largestValue2(arr));
    }
    // public static int largestValue1(int[] arr){
    //     int max = arr[0];
    //     for(int i = 1; i < arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }
    public static int largestValue2(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
