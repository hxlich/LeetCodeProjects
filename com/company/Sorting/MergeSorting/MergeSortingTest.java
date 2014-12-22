package com.company.Sorting.MergeSorting;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;

/**
 * Created by hanh on 12/22/2014.
 */
public class MergeSortingTest {
    private static int [] sample1 = {10,9,8,7,6,5,4,3,2,1};
    private static int [] sample2 = {5,4,3,2,1};
    private static int [] sample3 = {1,2};
    private static void testMS(int [] sample){
        ListNode ln = LinkedList.createList(sample);
        System.out.print("original:");
        printArray(sample);
        sample = MergeSorting.sort(sample);
        System.out.print("sorted:");
        printArray(sample);
    }


    private static void printArray(int [] array){
        System.out.print("[");
        for(int i=0 ; i<array.length ; i++){
            System.out.print(Integer.toString(array[i]) + ",");
        }

        System.out.print("]\n");
    }

    public static void test(){
        testMS(sample1);
        testMS(sample2);
        testMS(sample3);

    }
}
