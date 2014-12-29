package com.company.ExcelSheet.ExcelSheetColumnNumber;

/**
 * Created by hanh on 12/29/2014.
 */
public class ExcelTitleColumnNumber {

    private final static byte [] alpTable = {
            'A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z'};
    public int titleToNumber(String s) {
        int n = 0;
        byte[] b = s.getBytes();
        int power = (int)Math.pow(26,s.length()-1);
        for(int i = 0 ; i < s.length() ; i++ ){
            n += lookUpTable(b[i])*power;
            power /= 26;
        }

        return n;
    }
    private int lookUpTable(byte c){
        for(int i=0 ; i< alpTable.length ; i++){
            if(c == alpTable[i]){
                return i+1;
            }
        }
        return 0;
    }
}
