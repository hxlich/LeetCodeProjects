package com.company.PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return true;
    }
//    public boolean isPalindrome(int x) {
//        if( x < 0 ) return false;
//        if( x < 10) return true;
//
//        int d = 1;
//        while(Math.pow(10,d) <= x){
//            d++;
//        }
//
//        for(int i=d, j=0; i>d/2 && j<d/2; i--, j++){
//            int l = x % (int)(Math.pow(10,j+1));
//            if( j > 0){
//                l /= (int)(Math.pow(10,j));
//            }
//
//            int h = x % (int)(Math.pow(10,i));
//            int p = (int)(Math.pow(10,i-1));
//            h /=  p;//(int)(Math.pow(10,i));
//            if( l != h) return false;
//        }
//        return true;
//    }
}
