package Basic_Sliding_Window;

public class frequency_array {
    String s = "kdsjf;klajsdhfjkshdfkjasvsjkdj";
    int[] freq = new int[26];
    for(int i = 0 ; i < s.length(); i++){
        char ch = s.charAt(i);
        int idx = ch - 'a';
        freq[idx]++;  //freq[idx] = freq[idx]+1;
        //freq[ch]++; //fre[ch] = freq[ch]+1;
    }
}
