package org.example.collections.testing;

public class CodingChallenge {




    public static int[] codingChallenge(int[] b){


        int[] sum = new int[4];
        for(int i =0; i < b.length; i++){
            sum[i] = 2*b[i];
        }

        return sum;
    }

}
