package com.arrayTwoSumTest;

import com.arrayTwoSum.TwoElementsSum;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TwoElementsSumTest2 {
    @Test
    public void test()
    {
        TwoElementsSum t = new TwoElementsSum();
        assertTrue(t.calculateSum(new int[]{10,5,2,6,4,10},20));
    }
}
