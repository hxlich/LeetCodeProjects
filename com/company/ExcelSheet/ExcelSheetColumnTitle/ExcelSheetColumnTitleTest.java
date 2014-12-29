package com.company.ExcelSheet.ExcelSheetColumnTitle;

/**
 * Created by hanh on 12/29/2014.
 */
public class ExcelSheetColumnTitleTest {
    private static int sample1 = 26;
    private static int sample2 = 27;
    private static int sample3 = 28;
    private static int sample4 = 123;

    private static void testESCT(int s){
        ExcelSheetColumnTitle esct = new ExcelSheetColumnTitle();
        String title = esct.convertToTitle(s);
        System.out.print(Integer.toString(s));
        System.out.print("->");
        System.out.print(title +"\n");

    }
    public static void test(){
        testESCT(sample1);
        testESCT(sample2);
        testESCT(sample3);
        testESCT(sample4);
    }
}
