package com.arrayTwoSum;

import java.util.Arrays;

/**
 * The this program implements an application that
 * calculates the sum of two numbers in a given array
 * and compares with the sum value mentioned.
 * returns true if there are two numbers which sums to the mentioned value,
 * else returns false.
 *
 * @author Rumana
 */
public class TwoElementsSum {

    public boolean calculateSum(int[] arr,int sum)
    {
        int left=0,right=arr.length-1;
        //sorting the array using Arrays.sort()
        Arrays.sort(arr);

        //find whether the sum of two numbers is equal to the mentioned value
        //if sum of two numbers is not equal to value then print sum and return true;
        while(left<right)
        {
            if(arr[left]+arr[right]==sum) {
                System.out.println(arr[left]+" + "+arr[right]+" = "+sum);
                return true;
            }
            if(arr[left]+arr[right]<sum)
                left++;
            else
                right--;
        }
        //if sum of two numbers is not equal to value then print not found and return false
        System.out.println("not found");
        return false;
    }
}
