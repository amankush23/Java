import java.util.Arrays;

class reverse{
    public static void main(String[] args) {
    String s = "    the sky is blue     ";
    s = s.trim();
    // System.out.println(s);
    String [] arr =s.split("\\s+");
    // System.out.print(Arrays.toString(arr));
    String ans = " ";
    for(int i = arr.length-1; i>=0; i--){
        ans += arr[i] + " ";

   }
   System.out.print(ans.trim());
}
}