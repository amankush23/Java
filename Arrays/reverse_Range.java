public class reverse_Range {

   
        public static void reverseRange(int[] arr, int i, int j) {

            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String[] args) {
        int[] arr = {2,3,1,7,9,8};
        int i = 0;
        int j = arr.length-1;
        reverseRange(arr, i, j);
    }
}

