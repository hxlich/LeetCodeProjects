package com.company.BinaryTree.BalancedBinaryTree;

import com.company.BinaryTree.BinaryTree;
import com.company.Models.TreeNode;

/**
 * Created by hanh on 12/11/2014.
 */
public class BalancedBinaryTreeTest {
    private static int mTotalLevel = 0;
    static int [] sample1 = {1,2,3,0,0,4,5,0,0,0,0,6,0,0,0};
    static int [] sample2 = {1,0,2,0,0,0,3};
    static int [] sample3 = {1,2,3,4,5};
    static int [] sample4 = {1,2};
    static int [] sample5 = {1};


    private static void testBBT(int [] sample){
        TreeNode root = BinaryTree.createBinaryTree(sample);
        BalancedBinaryTree bbt = new BalancedBinaryTree();
        System.out.print("Sample:");
        printList(sample);
        boolean result = bbt.isBalanced(root);
        System.out.print("Result:" + result + "\n");
    }

    private static void printList(int [] sample){
        System.out.print("[");
        for(int i : sample){
            if( i == 0){
                System.out.print("#");
            }else {
                System.out.print(Integer.toString(i));
            }
            System.out.print(",");
        }
        System.out.print("]\n");
    }



    public static void test(){
        testBBT(sample1);
        testBBT(sample2);
        testBBT(sample3);
        testBBT(sample4);
    }
}
