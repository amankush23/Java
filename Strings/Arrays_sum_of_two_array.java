import java.util.ArrayList;

public class Arrays_sum_of_two_array {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 9};
        int[] arr1 = {3, 4, 5, 6, 7};
        Add(arr, arr1);
    }

    public static void Add(int[] arr1, int[] arr2) {
        ArrayList<Integer> ll = new ArrayList<>();
        int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + carry;
            ll.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = arr1[i] + carry;
            ll.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = arr2[j] + carry;
            ll.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        if (carry > 0) {
            ll.add(carry);
        }
        for (int k = ll.size() - 1; k >= 0; k--) {
            System.out.print(ll.get(k) + (k > 0 ? ", " : ""));
        }
        System.out.println("END");
    }
}
