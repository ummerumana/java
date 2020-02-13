package com.fondMedianTest;

import com.findMedian.FindArrayMedian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Testcase that checks for wrong input and fails
public class FindArrayMedianTest1 {
    @Test
    public void testFailure()
    {
        FindArrayMedian f = new FindArrayMedian();
        int res = f.findMedian(new int[]{1, 12, 15, 25},new int[]{2, 13, 30, 45});
        assertEquals(13,res);
    }
}
