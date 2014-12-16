package com.company.atoi;
//
// Implement atoi to convert a string to an integer.
//
// Hint: Carefully consider all possible input cases. If you want a challenge,
// please do not see below and ask yourself what are the possible input cases.
//
// Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
// You are responsible to gather all the input requirements up front.
public class Atoi {

    public int atoi(String str) {
        long ret = 0;
        int mSign = 1;
        int count = 0;
        boolean hasSign = false;
        byte[] buf = str.getBytes();
        for(byte b : buf){
            if( Character.isWhitespace(b)){
                if(count == 0) {
                    continue;
                }else {
                    break;
                }
            }else if((b == ((byte)'-')) || b == '+' || Character.isDigit(b)){
                count++;
                if(b == '-'){
                    if(hasSign == false){
                        hasSign = true;
                        mSign = -1;
                    }else {
                        return 0;
                    }
                }else if((b == ((byte)'+'))){
                    if(hasSign == true){
                        return 0;
                    }
                    hasSign = true;
                }else {
                    if( ret >= (Long.MAX_VALUE)/10){
                        if( mSign > 0) {
                            return Integer.MAX_VALUE;
                        }else {
                            return Integer.MIN_VALUE;
                        }
                    }
                    ret = ret*10 + b - 48;
                }
            }else {
                break;
            }
        }
        ret *= mSign;
        if( ret > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(ret < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else {
            return ((int)ret);
        }
    }
}
