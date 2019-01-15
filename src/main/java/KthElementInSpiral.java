public class KthElementInSpiral {

    public int get(int A[][], int k) {

        if (A == null || A.length == 0) {
            return -1;
        }

        if (k < 0 || totalElements(A) < k)
            return -1;

        int rows = A.length - 1, row = 0;
        int columns = A[0].length, column = 0;
        int offset = -1;
        int sign = 1;

        while (true) {

            if (k > columns) {
                k = k - columns;
                column += (sign * columns) + offset;
            } else {
                column += (sign * k) + offset;
                break;
            }

            if (k > rows) {
                k = k - rows;
                row += (sign * rows);
            } else {
                row += (sign * k);
                break;
            }

            columns--;
            rows--;
            offset = 0;
            sign *= -1;
        }

        return A[row][column];
    }

    private int totalElements(int[][] arr) {
        return arr.length * arr[0].length;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};

        int k = 17;

        KthElementInSpiral elementInSpiral = new KthElementInSpiral();

        int ele = elementInSpiral.get(arr, k);
        System.out.println("ele = " + ele);


    }
}
