public class first_occ_of_arr {
    public static void main(String[] args) {
       int[] arr = {2,3,4,6,4,3,7};
       int item = 4; 
       System.out.print(first_occ(arr, item,0));
    }
    public static int first_occ(int[] arr, int n,int indx){
        if(indx == arr.length){
            return -1;
        }
        if(arr[indx] == n){
            return indx;
        }
        else{
            return first_occ(arr, n, indx+1);
        }

    } 
}
