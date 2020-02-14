package com.snakeLadder;

public class WithoutSnake {
    public int getMinDiceThrows(int[] move, int n) {
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

}
