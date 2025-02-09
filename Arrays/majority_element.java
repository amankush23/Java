public class majority_element {
    public static int MajorityElement(int[] arr){
        int e = arr[0];
        int v = 1;
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] == e){
                v++;
            }
            else{
                v--;
                if(v == 0){
                    e=arr[i];
                    v=1;
                }
                
            }
        }
        return e;
    }
        public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,1,2,2,2};
        System.out.print(MajorityElement(arr));
    }
}
