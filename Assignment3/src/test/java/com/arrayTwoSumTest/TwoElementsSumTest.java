package com.arrayTwoSumTest;

import com.arrayTwoSum.TwoElementsSum;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

//Testcase that checks for correct input and passes
public class TwoElementsSumTest {
    @Test
    public void testSuccess()
    {
        TwoElementsSum t = new TwoElementsSum();
        assertTrue(t.calculateSum(new int[]{10,5,2,6,4},10));
    }
}
