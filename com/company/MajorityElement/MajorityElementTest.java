package com.company.MajorityElement;

/**
 * Created by hanh on 12/24/2014.
 */
public class MajorityElementTest {

    public static void test(){

        int [] sample1 = {1,1,1,2,2};
        MajorityElement me = new MajorityElement();
        int i = me.majorityElement(sample1);
        System.out.print(Integer.toString(i));
    }
}
