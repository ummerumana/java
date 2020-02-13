package com.arrayTwoSum;

import java.util.Arrays;

public class TwoElementsSum {

    public boolean calculateSum(int[] arr,int sum)
    {
        int i=0,j=arr.length-1;
        Arrays.sort(arr);
        while(i<j)
        {
            if(arr[i]+arr[j]==sum) {
                System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
                return true;
            }
            if(arr[i]+arr[j]<sum)
                i++;
            else
                j--;
        }
        System.out.println("not found");
        return false;
    }
}
