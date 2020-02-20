package com.usercreated;

// An implementation to find minimum number of dice
// throws required to reach last cell from first cell

import java.util.HashMap;
import java.util.Map;

public class MinMovesSnakeLadder {

    int[] move ;
    int n;

    // this block is to initialize the move array with the initial value
    // that shows the snakes and ladder cells
    public MinMovesSnakeLadder(HashMap<Integer,Integer> values,int num){
        n=num;
        move= new int[num];
        for (int i = 0; i < num; i++)
            move[i] = -1;
        for(Map.Entry<Integer,Integer> value : values.entrySet())
        {
            move[value.getKey()]=value.getValue();
        }
    }
    //method inturn calls a method present in WithoutSnake class
    public int getMinDiceThrows() {
       return new WithoutSnake().getMinDiceThrows(move,n);
    }

    //method inturn calls a method present in WithOneSnake class
    public int getMinDiceThrowswithSnake() {
        return new WithOneSnake().getMinDiceThrowswithSnake(move,n);
    }
}
