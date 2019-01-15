public class CountWaysToReachScoreWithoutConsequetiveTwos {

    static int countWays(int score){
        if(score == 0 || score == 1 || score == 2){
            return score;
        }
        return countWays(score,true);
    }
    static int countWays(int score, boolean isLastRunsIsOne){

        if(score == 0){
            return 1;
        }

        int count = 0;
        if(isLastRunsIsOne == true && score > 1){
            count = count + countWays(score-1,true) + countWays(score-2,false) ;
        }else{
            count = count + countWays(score-1,true);
        }
        return count;
    }

    static int countWaysDp(int score){

        if(score == 0 || score == 1 || score == 2){
            return score;
        }

        int[] dp = new int[score+1];
        dp[0] = 1;
        dp[1]= 1;
        dp[2] = 2;
        boolean isLastRunsIsOne = true;
        for(int i=3;i<=score;i++){

            if(isLastRunsIsOne == true && i<score-1) {
                dp[i] = dp[i] + dp[i - 1] + dp[i - 2] ;
                isLastRunsIsOne = false;
            }
            else {
                dp[i] = dp[i] + dp[i - 1] + 1;
                isLastRunsIsOne = true;
            }
        }
        return dp[score];



    }



    public static void main(String[] args) {
        int score = 5;
        System.out.println("countWays using recurr "+countWays(score));
        System.out.println("countWays using dp "+countWaysDp(score));
    }

}

