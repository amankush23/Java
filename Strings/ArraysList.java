import java.util.*;
public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        // ll.add(10);
        // ll.add(20);
        // ll.add(30);
      
        // System.out.println(ll);
        // ll.add(1,9);
        // System.out.println(ll);
        // ll.add(4,9);
        // System.out.println(ll);
        // System.out.println(ll.get(3));
        // System.out.println(ll.remove(2));
        // System.out.println(ll);
        // System.out.println(ll.size());
        // ll.set(1, 110);
        // System.out.println(ll);
        for(int i = 0 ; i < ll.size(); i++){
            System.out.print(ll.get(i)+" ");

        }
        System.out.println( );
        int  [ ] arr  = new int [5];
        for(int v:ll){
            System.out.print(v+" ");
        }
        System.out.println();
        for(int v:arr){
            System.out.print(v+" ");
        }
    }
}
