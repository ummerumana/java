package com.snakeLadderTest;

import com.snakeLadder.MinMovesSnakeLadder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//
public class MinMovesSnakeLadderTest {
    @Test
    public void testSuccess()
    {
        MinMovesSnakeLadder obj = new MinMovesSnakeLadder();

        int res = obj.getMinDiceThrows(30);
        System.out.println("min number of throws required are " + res);
        assertEquals(3,res);
    }
}
