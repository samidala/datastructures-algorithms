package com.dp;

import java.util.Arrays;

public class FindAbsDiffIsMinimalArrayProblem {



    public static int findMinAbsDiff(int[] a, int[] b){

        int aLen = a.length;
        int bLen = b.length;

        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<aLen;i++){
            for(int j=0;j<bLen;j++){
                minDiff = Math.min(Math.abs(a[i]-b[j]),minDiff);
            }
        }
        return minDiff;

    }

    public static int findMinAbsDiffEfficient(int[] a, int[] b){

        int aLen = a.length;
        int bLen = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = Integer.MAX_VALUE;

       int i = 0;
       int j = 0;

       while (i < aLen && j < bLen){

           int diff = Math.abs(a[i] - b[j]);
           if(diff < minDiff){
               minDiff = diff;
           }
           if(a[i] < b[j]){
               i++;
           }else {
               j++;
           }
       }


        return minDiff;

    }
}
