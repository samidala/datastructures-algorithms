public class PrintMatrixDiagnally {

    static void traverse(int[][] a){

        int leftColumn = 0;
        int topRow = 0;
        int rightColumn = a[0].length-1;
        int bottomRow = a.length - 1;

        while (leftColumn<=rightColumn && topRow <=bottomRow){
            System.out.println(a[topRow][leftColumn]);
            topRow++;
            for(int i=topRow;i>=0;i--){
                for(int j=0;j<=rightColumn;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
