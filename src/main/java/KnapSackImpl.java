public class KnapSackImpl {

    static int knapsack(int[] wts, int values[],int wt, int n){

        if(n ==0 || wt ==0 ){
            return 0;
        }

        if(wts[n-1] > wt){
            return knapsack(wts,values,wt,n-1);
        }
        return
                Math.max(values[n-1] + knapsack(wts,values,wt-wts[n-1],n-1),
                        knapsack(wts,values,wt,n-1));

    }
    static void knapsack(int[] wts, int values[],int wt){
        System.out.println(knapsack(wts,values,wt,wts.length));
    }

    static void  knapsackDp(int[] wts, int values[],int wt){

        int n = wts.length;
        int[][] dp = new int[n+1][wt+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }

        for(int i=0;i<=wt;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=wt;j++){
                if(wts[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],
                            dp[i-1][j-wts[i-1]] + values[i-1]);
                }

            }

        }
        System.out.println(dp[n][wt]);

        int res = dp[n][wt];

        /**
         * Let val[] = {1, 4, 5, 7}, wt[] = {1, 3, 4, 5}
         * W = 7.
         */
        for(int i = n; i > 0 && res > 0; i--){
            if(res == dp[i-1][wt]){
                continue;
            }else{
                System.out.println(wts[i-1]+" ");
                res = res - values[ i -1];
                wt = wt - wts[i - 1];
            }
        }
    }


    public static void main(String[] args) {
       int vals[] = {50, 50, 500, 60};
       int wts[] = {20, 10, 40, 30};
       int wt = 60;
       knapsack(wts,vals,wt);
        knapsackDp(wts,vals,wt);

    }
}
