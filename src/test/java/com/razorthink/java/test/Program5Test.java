package com.razorthink.java.test;

import com.razorthink.java.program5.Program5;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program5Test {
    @Test
    public void test() {
        Program5 p = new Program5();
        assertTrue(p.main());
    }
}
