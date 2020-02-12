package com.razorthink.java.test;

import com.razorthink.java.Program9.Program9;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program9Test {
    @Test
    public void test()
    {
        Program9 p = new Program9();
        assertTrue(p.main());
    }
}
