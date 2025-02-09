public class kadanes_algo {
    public static void main(String[] args) {
        int[] arr = {2,3,-7,5,-1,7};
        System.out.println(maxSubarraySum(arr));
    }
    public static int maxSubarraySum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i< arr.length; i++){
            sum += arr[i];
            ans = Math.max(ans, sum);
            //kadanes algorithm
            if(sum<0){
                sum = 0;
            }

        }return ans;
}
}
