import java.util.Stack;

public class AntiSpiralTraversal {

    public static void main(String[] args) {
        int a[][] = { {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        //traverse(a);

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
        Stack<Integer> s = new Stack<>();

        while(topRow<= bottomRow && leftColumn <= rightColumn){

            for(int i=leftColumn;i<=rightColumn;i++){
                System.out.print(a[topRow][i]+" ");
                s.push(a[topRow][i]);
            }
           // System.out.println();
            topRow++;


            for(int i=topRow;i<=bottomRow;i++){
                System.out.print(a[i][rightColumn]+" ");
                s.push(a[i][rightColumn]);
            }
          // System.out.println();
            rightColumn--;

            if(topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    System.out.print(a[bottomRow][i] + " ");
                    s.push(a[bottomRow][i] );
                }
               // System.out.println();
                bottomRow--;
            }

            if(leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(a[i][leftColumn] + " ");
                    s.push(a[i][leftColumn]);
                }
                // System.out.println();
                leftColumn++;
            }

        }
        System.out.println("\nanti spiral");

        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

    }


}
