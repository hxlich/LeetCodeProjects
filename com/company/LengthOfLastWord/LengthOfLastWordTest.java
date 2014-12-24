package com.company.LengthOfLastWord;

/**
 * Created by hanh on 12/24/2014.
 */
public class LengthOfLastWordTest {
    private static String sample = "Hello World ";
    public static void test(){
        LengthOfLastWord llw = new LengthOfLastWord();
        int r = llw.lengthOfLastWord(sample);
        System.out.print(Integer.toString(r));
    }
}
