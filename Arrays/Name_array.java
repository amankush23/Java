import java.util.*;
class Name_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];
    
    for(int i = 0; i < name.length; i++){
        name[i] = sc.next();
    }
    System.out.println("Here are the Names: ");
    for(int i = 0; i < name.length; i++){
        System.out.println(name[i]);
    }
    sc.close();
    }
}