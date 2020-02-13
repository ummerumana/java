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
        assertEquals(3,res);
    }
}
