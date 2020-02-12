package com.razorthink.java.Program9;

public class Program9 {
    public boolean main() {
        int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        for(int i=0;i<15;i++)
        {
            A[15]+=A[i];
        }
        A[16]=(A[15]+A[15])/16;
        A[17]=A[0];
        for(int i=0;i<17;i++)
        {
            if(A[17]>A[i])
                A[17]=A[i];
        }
        for(int i=0;i<18;i++)
        {
            System.out.print(A[i]+" ");
        }
        return true;
    }
}
