package com.razorthink.java.test;

import com.razorthink.java.program12.Program12;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program12Test {


    @Test
    public void test()
    {
        Program12 p = new Program12();
        assertTrue(p.main());

    }
}
