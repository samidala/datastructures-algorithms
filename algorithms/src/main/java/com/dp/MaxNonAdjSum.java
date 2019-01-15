package com.dp;

import java.util.Arrays;

public class MaxNonAdjSum {

    public static void main(String[] args) {

        int[] a = {-2,1,3,-4,5,2};

     //   nonAdjSum(a);

        a = new int[] {2,1,5,8,4};
        int res = nonAdjSumDp(a);
        System.out.println("result "+res );

        nonAdjSumDp(a);
        res = nonAdjSumDp(a);
        System.out.println("result "+res );

    }


    static int nonAdjSumDp(int a[]){

        int n = a.length;

        int sumIncludePrevValue = a[0];
        int  sumExcludePrevValue = 0;

        for(int i=1;i<n;i++){
            int excludedSum = Math.max(sumExcludePrevValue,sumIncludePrevValue);
            sumIncludePrevValue = sumExcludePrevValue + a[i];
            sumExcludePrevValue = excludedSum;

        }
        return Math.max(sumExcludePrevValue,sumIncludePrevValue);
    }

    static int maxSum  = 0;

    static void nonAdjSum(int[] a){
        int n = a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(nonAdjSum(a,n));
    }

    static int nonAdjSum(int[] a, int n){

        System.out.println("n "+n);
        if(n == 0){
            System.out.println("  returning 0 as the size is zero");
            return 0;
        }

        if(n == 1){
            System.out.println("  returning "+ a[0]+" as the size is 1");

            return a[0];
        }

        if(n == 2){
            System.out.println("  returning "+ Math.max(a[0],a[1])+" as the size is 2");
            return Math.max(a[0],a[1]);
        }


        int currentSum = 0;

        for (int i = 0; i < n; i+=2) {

          //  System.out.println("  i "+i);
            currentSum = a[i]+nonAdjSum(a,i);//Math.max(a[i]+nonAdjSum(a,i),nonAdjSum(a,i));
            currentSum = Math.max(maxSum,Math.max(currentSum,currentSum-a[i]));
            //System.out.println("  currentSum "+currentSum);

        }

        if(currentSum > maxSum){
            maxSum = currentSum;
        }
        return currentSum;

    }



    static int max(int a, int b,int c){
        return Math.max(a,Math.max(b,c));
    }


}
