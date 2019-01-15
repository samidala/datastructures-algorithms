public class MatrixZigZag {

    static void traverse(int[][] a){

        boolean isLeftToRight = true;

        int rows = a.length;
        int columns = a[0].length;
        for(int i=0;i<rows;i++){
            if(isLeftToRight) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(a[i][j]+" ");
                }
                isLeftToRight = false;
            }else {
                for(int j = columns-1;j>=0;j--){
                    System.out.print(a[i][j]+" ");
                }
                isLeftToRight = true;
            }
        }
    }

    public static void main(String[] args) {

        int a[][] = { {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        traverse(a);
    }
}
