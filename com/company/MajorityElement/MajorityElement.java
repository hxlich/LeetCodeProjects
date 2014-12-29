package com.company.MajorityElement;

import java.util.HashMap;

public class MajorityElement {
    private class Obj{

    }
    public int majorityElement(int[] num) {
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();

        for(int i=0 ; i< num.length ; i++) {
            int count = table.get(num[i]);
            if (count == 0) {
                table.put(num[i], 1);
            }else if(count*2 > num.length){
                return num[i];
            }else {
                table.put(num[i],count++);
            }
        }
        return 0;
    }
}
