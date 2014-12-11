package com.company.BinaryTree.MinDepthBinaryTree;

import com.company.BinaryTree.BinaryTree;
import com.company.Models.TreeNode;

/**
 * Created by hanh on 12/11/2014.
 */
public class MinDepthBinaryTreeTest {

    private static int mTotalLevel = 0;
    static int [] sample1 = {1,2,3,0,0,4,5,0,0,0,0,6,0,0,0};
    static int [] sample2 = {3,9,20,0,0,15,7};
    static int [] sample3 = {1,2,3,4,5};
    static int [] sample4 = {1,1,1,1,1,1};
    static int [] sample5 = {1};


    private static void testMDBT(int [] sample){
        TreeNode root = BinaryTree.createBinaryTree(sample);
        MinDepthBinaryTree mdbt = new MinDepthBinaryTree();
        System.out.print("Sample:");
        printList(sample);
        int result = mdbt.minDepth(root);
        System.out.print("Result:" + result );
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
        testMDBT(sample1);
    }
}
