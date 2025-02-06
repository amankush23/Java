import java.util.Scanner;
public class UpScaling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char[][] matrix = new char[2*n][2*n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length;  j++) {
                    if((i/2 + j/2)%2 ==0) {
                        matrix[i][j] = '#';
                    } else {
                        matrix[i][j] = '.';

                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
