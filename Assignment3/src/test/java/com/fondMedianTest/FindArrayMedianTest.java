package com.fondMedianTest;

import com.findMedian.FindArrayMedian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindArrayMedianTest {
    @Test
    public void test()
    {
        FindArrayMedian f = new FindArrayMedian();
        int res = f.findMedian(new int[]{1, 12, 15, 26, 38},new int[]{2, 13, 17, 30, 45});
        assertEquals(16,res);
    }
}
