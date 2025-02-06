public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {2,5,7,3,9,1,4};
        Sort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Sort(int[] arr , int si, int ei) {
        if(si>=ei){
            return ;
        }
        int idx = Partition(arr, si, ei);
        Sort(arr, si, idx-1);
        Sort(arr, idx+1, ei);

        
    }
    public static int Partition (int[] arr  ,int si, int ei){
        int item = arr[ei];
        int idx = si;
        for(int i  = si; i < ei; i++){
            if(arr[i] <= item){
                
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
