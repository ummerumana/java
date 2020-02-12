package com.razorthink.java.test;

import com.razorthink.java.program2.Program2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Program2Test {
        @Test
        public void test() {
            Program2 p = new Program2();
           int res =(int) p.main(10,2);
           assertEquals(20,res);
        }

}
