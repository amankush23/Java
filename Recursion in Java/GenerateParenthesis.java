import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static void generateParenthesis(int n, int closed, int open, String str, List<String> ans) {
        if (closed == n && open == n) {
            ans.add(str);
            return;
        }
        if (open < n) {
            generateParenthesis(n, closed, open + 1, str + "(", ans);
        }
        if (closed < open) {
            generateParenthesis(n, closed + 1, open, str + ")", ans);
        }
    }
}