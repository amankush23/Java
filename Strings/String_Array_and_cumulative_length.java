import java.util.*; 
public class String_Array_and_cumulative_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        String str[] = new String[size];
        int TotLength = 0;
        System.out.println("Enter the Strings below: ");
        for(int i = 0; i < size; i++){
            str[i] = sc.next();
            TotLength += str[i].length();

        }
        System.out.print("The cumulative or combined length of the string in array is: "+ TotLength);
        sc.close();
    }
}
