public class TraverseMatrixFromLeftLower2RightTop {

    public static void main(String[] args) {
        int a[][] = { {1, 2, 3},
                      {4, 8, 2},
                      {1, 5, 3} };
        traverse(a);
    }
    static void traverse(int[][] a){


        int m = a.length;
        int n = a[0].length;
        int[][] dp = new int[m][n];

        dp[m-1][0] = a[m-1][0];


        for(int i=m-2;i>=0;i--){
            dp[i][0] = dp[i+1][0] + a[i][0];
        }

        for(int i=1;i<n;i++){
            dp[m-1][i] = dp[m-1][i-1] + a[m-1][i];
        }

        display(a);

        display(dp);


        for(int i=m-2;i>=0;i--){
            for(int j=1;j<n;j++){
                int diagnalLeft = dp[i+1][j-1];
                int left = dp[i][j-1];
                int btm = dp[i+1][j];
                System.out.println("diagnalLeft "+diagnalLeft);
                System.out.println("left "+left);
                System.out.println("btm "+btm);
                int min = min(diagnalLeft,left,btm);
                dp[i][j] = min + a[i][j];
                display(dp);
            }

        }

        display(dp);

        System.out.println(dp[0][n-1]);




    }
    static void display(int[][] dp){
        int m = dp.length;
        int n = dp[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*********");
    }

   static int min(int a,int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
