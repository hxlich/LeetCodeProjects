package com.company.BinaryTree.BinaryTreeLevelOrder;

import com.company.BinaryTree.BinaryTree;
import com.company.Models.TreeNode;

import java.util.List;

/**
 * Created by hanh on 12/11/2014.
 */
public class BinaryTreeLevelOrderTest {

    private static int mTotalLevel = 0;
    static int [] sample1 = {1,2,3,0,0,4,0,0,0,0,0,5,0,0,0};
    static int [] sample2 = {3,9,20,0,0,15,7};
    static int [] sample3 = {1,2,3,4,5};
    static int [] sample4 = {1,1,1,1,1,1};
    static int [] sample5 = {1};

    private static void testBTLO(int [] sample){
        TreeNode root = BinaryTree.createBinaryTree(sample);
        BinaryTreeLevelOrder bto = new BinaryTreeLevelOrder();

        List<List<Integer>> result = bto.levelOrder(root);
        System.out.print("lala");
    }


    public static void test(){
        testBTLO(sample3);
    }
}
