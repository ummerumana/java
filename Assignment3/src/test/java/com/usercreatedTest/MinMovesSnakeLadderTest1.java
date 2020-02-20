package com.usercreatedTest;

import com.usercreated.MinMovesSnakeLadder;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MinMovesSnakeLadderTest1 {
        @Test
        public void testSuccess()
        {
            HashMap<Integer,Integer> map=new HashMap<Integer, Integer>(){
                {put(2,21);
                    put(4,7);
                    put(10,25);
                    put(19,28);
                    put(26,0);
                    put(20,8);
                    put(16,3);
                    put(18,6);}
            };

            MinMovesSnakeLadder obj = new MinMovesSnakeLadder(map,30);

        int res = obj.getMinDiceThrowswithSnake();
        System.out.println("min number of throws required are " + res);
        assertEquals(4,res);
    }
}
