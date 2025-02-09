package Basic_Sliding_Window;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 3;
        System.out.print(Product_less_Than_K(arr, k));
    }
    public static int Product_less_Than_K(int[] arr, int k ){
        int ans = 0, si = 0, ei = 0 , p = 1; 
        while(ei< arr.length){
            //grow
            p = p*arr[ei];
            
            //shrink
            while(p>=k){
                p = p/arr[si];
                si++;
            }
            //ans update
            ans = ans + (ei-si+1);
            ei++;
        }
        return ans;
    }

}
