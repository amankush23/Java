public class wave_print {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5},{1,8,9,7},{12, 56, 78,23}};
        print(arr);
        }
        public static void print(int[][] arr) {
            for(int col = 0 ; col < arr[0].length; col++){
                if(col % 2 == 0){
                    for(int row = 0; row < arr.length; row++){
                        System.out.print(arr[row][col]+" ");
                    }
                }
                else{
                    for(int row = arr.length-1; row>=0; row--){
                        System.out.print(arr[row][col]+" ");
                    }
                }
            }
            
        }
}
