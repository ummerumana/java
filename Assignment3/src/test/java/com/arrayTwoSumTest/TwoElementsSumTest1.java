package com.arrayTwoSumTest;

import com.arrayTwoSum.TwoElementsSum;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

//Testcase that checks for wrong input and fails
public class TwoElementsSumTest1 {
    @Test
    public void testFailure()
    {
        TwoElementsSum t = new TwoElementsSum();
        boolean res = t.calculateSum(new int[]{0,5,2,6,4},13);
        assertTrue(res);

    }
}
