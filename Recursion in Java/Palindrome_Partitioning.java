import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        Partition(ques, ll,ans);
    }
    public static void Partition(String ques, List<String> ll, List<List<String>> ans){
        if(ques.length() == 0){
            // System.out.println(ans);
            ans.add(new ArrayList<String>(ll));
            return;
        }
        for(int cut = 1; cut <=ques.length(); cut++){
            String s = ques.substring(0, cut);
            if(isPalindromic(s)){
                ll.add(s);
                Partition(ques.substring(cut),ll ,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindromic(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
