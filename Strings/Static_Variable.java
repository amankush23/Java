public class Static_Variable {
    static int val = 100;
    public static void main(String[] args) {
        System.out.println(val);
        System.out.println(Add(2,7));
        System.out.println(val);
    }
    public static int Add(int a, int b){
        int val = 90;
        Static_Variable.val = Static_Variable.val+5;
        return a+b;
    }

}
