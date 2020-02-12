package com.razorthink.java.test;

import com.razorthink.java.Demo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;


public class DemoTest {

    @Test
    public void test1()
    {
        Demo d = new Demo();
        assertEquals(d.method1(), "hi");
    }






}
