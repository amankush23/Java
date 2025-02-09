public class SpiralPrint {
    public static void Spiral_Print(int arr[][]){
        int minc=0,minr=0,maxc=arr[0].length-1,maxr=arr.length-1;
        int elements=arr.length*arr[0].length;
        int c=0;
        while( c<elements){
        for(int i=minc;i<=maxc && c<elements;i++){
            System.out.print(arr[minr][i]+" ");
            c++;
        }
        minr++;
        for(int j=minr;j<=maxr && c<elements;j++){
            System.out.print(arr[j][maxc]+" ");
            c++;
        }
        maxc--;
        for(int i=maxc;i>=minc && c<elements;i--){
            System.out.print(arr[maxr][i]+" ");
            c++;
        }
        maxr--;
        for(int j=maxr;j>=minr && c<elements ;j--){
            System.out.print(arr[j][minc]+" ");
            c++;
        }
        minc++;
    }
}
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Spiral_Print(arr);
    }
}