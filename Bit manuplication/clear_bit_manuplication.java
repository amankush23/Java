public class clear_bit_manuplication {
    public static void main(String args[]){
        int n = 5; 
        int pos = 2;
        int bitmask = 1<<pos;

        int notOperation = ~(bitmask);
        int  result = notOperation & n;
        System.out.print(result);
    }
}
