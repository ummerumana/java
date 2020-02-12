package com.razorthink.java.test;

import com.razorthink.java.program8.Program8;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Program8Test {
    @Test
    public void test()
    {
        Program8 p = new Program8();
        assertTrue(p.main(new String[]{String.valueOf(10), String.valueOf(20)}));
    }
}
