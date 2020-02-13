package com.findMedian;

import java.util.Arrays;

public class FindArrayMedian {
    public int findMedian(int[] a,int[] b)
    {
        int[] arr = new int[a.length+b.length];
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            arr[i] = a[i];
            count++;
        }
        for(int j = 0; j < b.length;j++) {
            arr[count++] = b[j];
        }
        Arrays.sort(arr);
        return (arr[arr.length/2-1]+arr[arr.length/2])/2;
    }
}