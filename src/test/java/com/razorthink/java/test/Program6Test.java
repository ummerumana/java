package com.razorthink.java.test;

import com.razorthink.java.program6.Program6;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Program6Test {
    @Test
    public void test() {
        Program6 p = new Program6();
        assertTrue(p.main(new String[]{"malayalam"}));
    }
}
