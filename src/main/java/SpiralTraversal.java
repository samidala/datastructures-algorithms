public class SpiralTraversal {

    public static void main(String[] args) {
        int a[][] = { {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        traverse(a);

        a = new int[][]{
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        System.out.println("************");
        traverse(a);
    }
    static void traverse(int[][] a){

        int rows = a.length;
        int columns = a[0].length;

        int topRow = 0;
        int bottomRow = rows - 1;

        int leftColumn = 0;
        int rightColumn= columns - 1;

        while(topRow<= bottomRow && leftColumn <= rightColumn){

            for(int i=leftColumn;i<=rightColumn;i++){
                System.out.print(a[topRow][i]+" ");
            }
           // System.out.println();
            topRow++;


            for(int i=topRow;i<=bottomRow;i++){
                System.out.print(a[i][rightColumn]+" ");
            }
           // System.out.println();
            rightColumn--;

            if(topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    System.out.print(a[bottomRow][i] + " ");
                }
                //System.out.println();
                bottomRow--;
            }

            if(leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(a[i][leftColumn] + " ");
                }
                // System.out.println();
                leftColumn++;
            }

        }

    }


}
