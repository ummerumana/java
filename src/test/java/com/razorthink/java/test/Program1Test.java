package com.razorthink.java.test;

import com.razorthink.java.program1.Program1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program1Test {
    @Test
    public void test()
    {
        Program1 p = new Program1();
        assertTrue(p.main());
    }
}
