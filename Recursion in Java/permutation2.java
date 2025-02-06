public class permutation2 {
    public static void main(String[] args) {
        String ques = "abca";
        Permutation(ques, "");
    }
    public static void Permutation(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < ques.length(); i++){
            char ch = ques.charAt(i);
            if(!isVlid(ques, i+1, ch)){
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            Permutation(s1+s2, ans+ch);
        }
    }
}
    public static boolean isVlid(String str, int i , char ch){
        for(int k = i; k < str.length(); i++){
            if(str.charAt(k) == ch){
                return true;          
             }
        }
        return false;
    }
}
