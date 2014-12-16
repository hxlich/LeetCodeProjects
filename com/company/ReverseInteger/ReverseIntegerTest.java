package com.company.ReverseInteger;

/**
 * Created by hanh on 12/15/2014.
 */
public class ReverseIntegerTest {

    private static int a = 1534236469;
    private static int b = -123;
    private static int c = 1234567890;
    private static int d = -11123;
    private static void testRI(int number){
        System.out.print("original:" + Integer.toString(number) + " ");
        ReverseInteger ri = new ReverseInteger();
        int res = ri.reverse(number);
        System.out.print("new:" + Integer.toString(res) +"\n");
    }

    public static void test(){
        testRI(a);
        testRI(b);
        testRI(c);
        testRI(d);
    }
}
