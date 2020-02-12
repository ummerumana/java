package com.razorthink.java.test;

import com.razorthink.java.program10.Program10;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program10Test {
    @Test
    public void test()
    {
        Program10 p = new Program10();
        assertTrue(p.main());
    }
}
