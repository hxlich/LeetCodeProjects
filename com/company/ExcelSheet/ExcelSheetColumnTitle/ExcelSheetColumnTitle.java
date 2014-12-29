package com.company.ExcelSheet.ExcelSheetColumnTitle;

/**
 * Created by hanh on 12/29/2014.
 */
public class ExcelSheetColumnTitle {

    private final static char [] alpTable = {
            'A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z'};
    public String convertToTitle(int n) {

        String title = "";
        for(; n > 0 ;){
            n -= 1;
            int r = n % 26;
            title = alpTable[r] + title ;
            n /= 26;
        }

        return title;
    }
}
