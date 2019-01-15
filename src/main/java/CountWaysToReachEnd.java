public class CountWaysToReachEnd {


  static int countWithMaxThreeSteps(int totalNoOfSteps){

      // ways[n-1] + ways[n-2] + ways[n-3]

          if(totalNoOfSteps == 0 || totalNoOfSteps == 1){
              return 1;
          }
          if(totalNoOfSteps == 2){
              return 2;
          }

          return countWithMaxThreeSteps(totalNoOfSteps-3) + countWithMaxThreeSteps(totalNoOfSteps-2)
                  +countWithMaxThreeSteps(totalNoOfSteps-1) ;

     }

      static void countWithMaxThreeStepsDp(int totalNoOfSteps){

            int dp[] = new int[totalNoOfSteps + 1];
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            for(int i=3;i<=totalNoOfSteps;i++){
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
          System.out.println(dp[totalNoOfSteps]);
      }

    public static void main(String[] args) {

        int totalNoOfSteps =4;
        int totalWays = countWithMaxThreeSteps(totalNoOfSteps);
        System.out.println("totalWays "+totalWays);
        countWithMaxThreeStepsDp(totalNoOfSteps);

        System.out.println("countWithMaxThreeSteps "+countWithMaxSteps(4,3));
        countWithMaxStepsDp(4,3);

    }


    static int countWithMaxSteps(int totalNoOfSteps,int maxSteps){

        // ways[n-1] + ways[n-2] + ways[n-3] + ways[n - maxSteps]

        if(totalNoOfSteps == 0 || totalNoOfSteps == 1){
            return 1;
        }
      /*  if(totalNoOfSteps == 2){
            return 2;
        }*/
        int res = 0;

        for(int i=1;i<=totalNoOfSteps&& i<=maxSteps;i++){
            res+=countWithMaxSteps(totalNoOfSteps-i,maxSteps);
        }
        return res;
    }

    static void countWithMaxStepsDp(int totalNoOfSteps,int maxSteps){

      int[] dp = new int[totalNoOfSteps + 1];
      dp[0] = 1;
      dp[1] = 1;
      for(int i=2;i<=totalNoOfSteps;i++){
          for(int j=1;j<=i && j<=maxSteps;j++){
              dp[i] = dp[i-j] + dp[i];
          }
      }
        System.out.println("total count "+dp[totalNoOfSteps]);
    }
}
