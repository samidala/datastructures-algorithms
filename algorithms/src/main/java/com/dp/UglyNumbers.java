package com.dp;

public class UglyNumbers {


    public static int nthUglyNos(int n){

        int nextMultiplesOfTwo = 2;
        int nextMultiplesOfThree = 3;
        int nextMultiplesOfFive = 5;

        int twosIndex = 0;
        int threesIndex = 0;
        int fivesIndex = 0;

        int[] dp = new int[n];
        dp[0] = 1;
        int nextUglyNo = 1;
        for (int i = 1; i < n; i++) {

             nextUglyNo = min(nextMultiplesOfTwo,nextMultiplesOfThree,nextMultiplesOfFive);
           // System.out.println(nextUglyNo);
            dp[i] = nextUglyNo;
            if(nextUglyNo == nextMultiplesOfTwo){
                twosIndex++;
                nextMultiplesOfTwo = dp[twosIndex] * 2;
            } if(nextUglyNo == nextMultiplesOfThree){
                threesIndex++;
                nextMultiplesOfThree = dp[threesIndex] * 3;
            } if(nextUglyNo == nextMultiplesOfFive){
                fivesIndex++;
                nextMultiplesOfFive = dp[fivesIndex] * 5;
            }
        }

        return nextUglyNo;

    }
    static int min(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
