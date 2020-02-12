package com.razorthink.java.test;

import com.razorthink.java.program3.Program3;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program3Test {
    @Test
    public void test() {
        Program3 p = new Program3();
        assertTrue(p.main());
    }
}
