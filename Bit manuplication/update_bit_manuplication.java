import java.util.Scanner;

public class update_bit_manuplication {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        Scanner sc = new Scanner(System.in);
        int bitDetail = sc.nextInt();
        
        if(bitDetail == 0){
            int newNumber = ~(bitmask);
            int result = newNumber & n;
            System.out.print(result);
        }
        else{
            int out = bitmask | n;
            System.out.print(out);
        }
        sc.close();
    }
}
