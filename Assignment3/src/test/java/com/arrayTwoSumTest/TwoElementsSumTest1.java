package com.arrayTwoSumTest;

import com.arrayTwoSum.TwoElementsSum;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoElementsSumTest1 {
    @Test
    public void test()
    {
        TwoElementsSum t = new TwoElementsSum();
        assertFalse(t.calculateSum(new int[]{0,5,2,6,4},13));
    }
}
