package com.snakeLadder;

// An implementation to find minimum number of dice
// throws required to reach last cell from first cell

public class MinMovesSnakeLadder {
    int n = 30;
    int[] move = new int[n];

    // this block is to initialize the move array with the initial value
    // that shows the snakes and ladder cells
    public MinMovesSnakeLadder(){
        for (int i = 0; i < n; i++)
            move[i] = -1;
        // Ladders
        move[2] = 21;
        move[4] = 7;
        move[10] = 25;
        move[19] = 28;

        // Snakes
        move[26] = 0;
        move[20] = 8;
        move[16] = 3;
        move[18] = 6;
    }
    //method inturn calls a method present in WithoutSnake class
    public int getMinDiceThrows(int n) {
       return new WithoutSnake().getMinDiceThrows(move,n);
    }

    //method inturn calls a method present in WithOneSnake class
    public int getMinDiceThrowswithSnake(int n) {
        return new WithOneSnake().getMinDiceThrowswithSnake(move,n);
    }
}
