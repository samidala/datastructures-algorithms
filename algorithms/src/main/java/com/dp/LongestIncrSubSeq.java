package com.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LongestIncrSubSeq {


     int maxLisLength = 0;

     List<Integer>[] list;

    public  int lis(int a[]){

        if(a == null){
            return 0;
        }
        if(a.length == 1){
            return  1;
        }
        if(a.length == 2){
            if(a[0] < a[1])
                return 2;
            else
                return 1;
        }
        list = new ArrayList[a.length];
        Arrays.fill(list, new ArrayList<Integer>());

        lis(a, a.length);
        for(List<Integer> l: list){
            System.out.println(l);
        }
        return maxLisLength;
    }
    private  int lis(int a[], int n){

        if(n ==0 || n == 1){
            return n;
        }

        int lisLength = 1;

        for(int i = 1; i< n; i++){
            int lisLenTillI = lis(a,i);
            if(a[n-1] > a[i-1] && lisLenTillI + 1 > lisLength){

                lisLength = lisLenTillI + 1;
            }
        }

        if(lisLength > maxLisLength){
            list[n-1].add(a[n-1]);
            maxLisLength = lisLength;
        }
        return lisLength;


    }

    public int lisDp(int[] a){


        int n = a.length;

        if(a == null){
            return 0;
        }
        if(n == 1){
            return  1;
        }


        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for(int i=1;i<n;i++){
            for(int j = 0; j < i ; j++){
                if(a[i] > a[j] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int maxLisLength = dp[0];

        for(int i = 1; i < n ; i++){
            if(dp[i] > maxLisLength){
                maxLisLength = dp[i];
            }
        }
        return maxLisLength;
    }

    public int lisDpImprovised(int[] a){
        int n = a.length;

        if(a == null){
            return 0;
        }
        if(n == 1){
            return  1;
        }

        int[] tailTable = new int[n];

        int len = 1;

        tailTable[0] = a[0];

        for(int i=1; i < n ; i ++){
            if(a[i] < tailTable[0]){
                tailTable[0] = a[i];
            }else if(a[i] > tailTable[len - 1] ){
                tailTable[len++] = a[i];
            }else{

                int position = ceilIndex(tailTable,len - 1, a[i]);
                tailTable[position] = a[i];
            }
        }
        return len;
    }

    public int[] printLisDpImprovised(int[] a){
        int n = a.length;

        if(a == null){
            return new int[0];
        }
        if(n == 1){
            return  a;
        }

        int[] lisTable = new int[n];
        int[] prevIndexes = new int[n];

        Arrays.fill(prevIndexes, -1);
        lisTable[0] = 0;
        int len = 1;

        for(int i = 1; i < n ; i++){
            if(a[i] < a[lisTable[0]]){
                lisTable[0] = i;
            }else if(a[i] > a[lisTable[len - 1]] ){
                prevIndexes[i] = lisTable[len - 1];
                lisTable[len++] = i;
            }else{
                int pos = ceilIndex(a,lisTable,len-1,a[i]);
                prevIndexes[i] = lisTable[pos];
                lisTable[pos] = i;
            }
        }

        System.out.println("len "+len);
        int[] result = new int[len];

       // int index = len;

        for(int i = lisTable[len -1], index = len - 1; i >= 0 ;i = prevIndexes[i],index--){
            result[index] = a[i];
        }
        return result;


    }

    private int ceilIndex(int[] a, int[] tailTable, int high, int key){
        int low = -1;
        while ( high - low > 1){
            int mid = low + (high - low) / 2;
            if(a[tailTable[mid]] >= key){
                high = mid;
            }else{
                low = mid;
            }
        }
        return high;
    }

    private int ceilIndex(int[] tailTable, int high, int key){
        int low = -1;
        while ( high - low > 1){
            int mid = low + (high - low) / 2;
             if(tailTable[mid] >= key){
                 high = mid;
            }else{
                low = mid;
            }
        }
        return high;
    }


}
