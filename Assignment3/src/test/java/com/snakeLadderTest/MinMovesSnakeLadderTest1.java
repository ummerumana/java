package com.snakeLadderTest;

import com.snakeLadder.MinMovesSnakeLadder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinMovesSnakeLadderTest1 {
    @Test
    public void testSuccess()
    {
        MinMovesSnakeLadder obj = new MinMovesSnakeLadder();

        int res = obj.getMinDiceThrowswithSnake(30);
        System.out.println("min number of throws required are " + res);
        assertEquals(4,res);
    }
}
