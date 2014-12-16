package com.company.atoi;

/**
 * Created by hanh on 12/15/2014.
 */
public class AtoiTest {
    private static String a = "-9223372036854775809";
    private static String b = "         +012a3";
    private static String c = "-1";
    private static String d = "-123-132";
    private static void testRI(String number){
        System.out.print("original:" + number + " ");
        Atoi atoi = new Atoi();
        int res = atoi.atoi(number);
        System.out.print("new:" + Integer.toString(res) +"\n");
    }

    public static void test(){
        testRI(a);
        testRI(b);
        testRI(c);
        testRI(d);
    }
}
