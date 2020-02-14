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
    public int getMinDiceThrows(int n) {
        int count =0;
        int i=0;
        while(i<n)
        {
            //if we are on last cell that is 30 then we are done and return count value
            if(i==n-1) {
                return count;
            }

            int max =0;
            int j=1;

            //loop which runs from 1 to 6 and calculates max cells we can move
            for(;i+j<n&&j<=6;j++)
            {
                if(move[i+j]>max)
                {
                    max=move[i+j];
                }
            }

            //if there is no ladder then increment i with max number on the dice
            if(max==0)
            {
                i+=j-1;
                count++;
            }
            else {
                i+= max;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new MinMovesSnakeLadder().getMinDiceThrowswithSnake(30);
    }
    public int getMinDiceThrowswithSnake(int n) {
        boolean flag =false;
        int count =0;
        int i=0;
        while(i<n)
        {
            //if we are on last cell that is 30 then we are done and return count value
            if(i==n-1) {
                return count;
            }

            int max =0;
            int j=1;

            //loop which runs from 1 to 6 and calculates max cells we can move
            for(;i+j<n&&j<=6;j++)
            {
                if(flag==false && move[i+j]<i+j && move[i+j]!=-1)
                {
                    flag=true;
                    max=move[i+j];
                    i-=max;
                    count++;
                    break;
                }
                if(move[i+j]>max)
                {
                    max=move[i+j];
                }
            }
            //if there is no ladder then increment i with max number on the dice
            if(max==0)
            {
                i+=j-1;
                count++;
            }
            else if(flag==false) {
                    i+= max;
                    count++;
             }
        }
        return count;
    }
}
