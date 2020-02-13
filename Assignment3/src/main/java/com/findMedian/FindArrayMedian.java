package com.findMedian;

import java.util.Arrays;
/**
 * The this program implements an application that
 * find the median of two arrays
 * returns an integer that holds the value of median.
 *
 * @author Rumana
 */

public class FindArrayMedian {
    public int findMedian(int[] array1,int[] array2)
    {
        //create a new array of size sum size of two arrays
        int[] arr = new int[array1.length+array2.length];
        int count = 0;

        //add array one to it
        for(int i = 0; i < array1.length; i++) {
            arr[i] = array1[i];
            count++;
        }
        //add array two to it
        for(int j = 0; j < array2.length;j++) {
            arr[count++] = array2[j];
        }
        //sort the array
        Arrays.sort(arr);

        //return the median
        return (arr[arr.length/2-1]+arr[arr.length/2])/2;
    }
}