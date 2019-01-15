package com.dp;

public class
BinarySearch {

    public static int findNearestNo(int[] a, int key){

        int l = -1;
        int r = a.length;

        while (r - l > 1){
            int m = l + (r - l )/2;
            if(a[m] == key){
                return m;
            }else if(a[m] > key){
                r = m;
            }else {
                l = m;
            }
        }
        int x = Math.abs(key - a[l]);
        int y = Math.abs(key - a[r]);
        return x > y ? r : l;
    }
}
