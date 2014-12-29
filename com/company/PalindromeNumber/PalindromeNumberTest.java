package com.company.PalindromeNumber;

/**
 * Created by hanh on 12/16/2014.
 */
public class PalindromeNumberTest {
    private static int sample = 10;
    public static void test(){
        PalindromeNumber pn = new PalindromeNumber();
        System.out.print(Boolean.toString(pn.isPalindrome(sample)));
    }

}
