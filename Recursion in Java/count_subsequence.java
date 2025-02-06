public class count_subsequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("\n"+countSubsequence(str,"")); 
    }
        public static int countSubsequence(String ques, String ans){
            if(ques.length() == 0){
                System.out.print(ans+" ");
                return 1;
            }
            char ch = ques.charAt(0);
            int a = countSubsequence(ques.substring(1),ans);
            int b = countSubsequence(ques.substring(1),ans+ch);
            return a+b;
        }
        // System.out.println("\n"+count);
    }
    // static int count = 0;
    // public static void print(String ques, String ans){
    //     if(ques.length() == 0){
    //         System.out.print(ans+" ");
    //         count++;
    //         return;
    //     }
    //     char ch = ques.charAt(0);
    //     print(ques.substring(1),ans);
    //     print(ques.substring(1),ans+ch);
    // }

    
    