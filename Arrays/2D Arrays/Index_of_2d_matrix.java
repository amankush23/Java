import java.util.Scanner;

public class Index_of_2d_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        
        //Input
        for(int i=0; i < rows; i++ ){
            for(int j = 0; j < cols; j++ ){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number that you want to find x: ");
        int x = sc.nextInt();

        //Output
        boolean found = false;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(numbers[i][j] == x){
                    System.out.println("Found " + x + " at position: (" + i + ", " + j + ")");
                    found = true;}
        }
        System.out.println();
        sc.close();
    }
    if(!found){
        System.out.print(x+ " not found!");
    }
}
}