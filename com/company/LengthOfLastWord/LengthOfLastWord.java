package com.company.LengthOfLastWord;

/**
 * Created by hanh on 12/24/2014.
 */
public class LengthOfLastWord {
    private boolean isSpace(char a){
        if(a == 0x20 || a == 0x09 || a == 0x0a || a == 0x0b || a == 0x0c || a == 0xd){
            return true;
        }
        return false;
    }
    public int lengthOfLastWord(String s) {
        char[] charArray =s.toCharArray();
        int count = 0;
        boolean first = true;
        for(int i=0 ;i<charArray.length ; i++){
            if(isSpace(charArray[i])){
                first = true;
            }else {
                if(first){
                    count = 0;
                    first = false;
                }
                count++;
            }
        }
        return count;
    }
}
