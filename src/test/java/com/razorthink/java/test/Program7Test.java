package com.razorthink.java.test;

import com.razorthink.java.program7.Program7;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program7Test {
    @Test
    public void test()
    {
        Program7 p = new Program7();
        assertTrue(p.main(new String[]{String.valueOf(1), String.valueOf(3)}));
    }
}
