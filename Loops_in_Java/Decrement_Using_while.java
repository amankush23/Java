import java.util.*;
public class Decrement_Using_while {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int decrement = sc.nextInt();
    while(decrement<100){
        System.out.print(decrement+" ");
        decrement--;
        if(decrement<0){
            break;
        }
    }
    sc.close();
    }
}
