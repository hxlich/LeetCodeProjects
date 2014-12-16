package com.company.ReverseInteger;

//Reverse digits of an integer.
//
//        Example1: x = 123, return 321
//        Example2: x = -123, return -321
//
//        click to show spoilers.
public class ReverseInteger {
    private boolean mSign = false;

    public int reverse(int x) {
        if( x == 0 ){
            return 0;
        }

        if( x < 0 ){
            mSign = true;
            x = -x;
        }

        int newX = realReverse(x);

        if(mSign){
            return -newX;
        }else {
            return newX;
        }

    }

    private int realReverse(int x){
        long a = 0;
        for(;x>0;){
            int t = x%10;
            x /= 10;
            a = a*10 + t;
            if(a > Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int)a;
    }
}
