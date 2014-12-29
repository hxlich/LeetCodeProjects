package com.company.ExcelSheet.ExcelSheetColumnNumber;

/**
 * Created by hanh on 12/29/2014.
 */
public class ExcelTitleColumnNumberTest {
    private static String sample1 = "AB";
    private static String sample2 = "ABC";
    private static String sample3 = "Z";
    private static String sample4 = "C";

    private static void testETCN(String s){
        ExcelTitleColumnNumber etcn = new ExcelTitleColumnNumber();
        int title = etcn.titleToNumber(s);
        System.out.print( s);
        System.out.print("->");
        System.out.print(Integer.toString(title) +"\n");

    }
    public static void test(){
        testETCN(sample1);
        testETCN(sample2);
        testETCN(sample3);
        testETCN(sample4);
    }
}
