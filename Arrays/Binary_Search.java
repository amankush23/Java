public class Binary_Search {
    public static void main(String[] args) {
    int[] arr = {1,3,4,6,8,13,11,20, 24,30};
    int key  = 11; 
    System.out.println(binarySearch(arr, key));
    }
    public static int binarySearch(int[] arr, int item) {
        int low = 0; 
        int high = arr.length-1;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == item){
                return mid;
            }
            else if(arr[mid] > item){
                low = mid+1;
            }
            else{
                low = mid-1;
            }
            
        }
        return -1;
        
    }
}
