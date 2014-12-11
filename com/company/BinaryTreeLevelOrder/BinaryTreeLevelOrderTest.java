package com.company.BinaryTreeLevelOrder;

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

    private static int [] mSample;
    private static TreeNode createBinaryTree(int [] in){
        if (in == null || in.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(in[0]);
        mSample = in;
        mTotalLevel = 5;//getTreeLevel(in.length);
        root = createBinaryTreeByLevel(1, 0, root);
        return root;
    }

    private static int getTreeLevel(int count){
        int i;
        for(i=1;count >0 ;i++){
            count -= (int)(Math.pow(2,i));
        }
        return i;
    }

    private static TreeNode createBinaryTreeByLevel(int level,int p, TreeNode tn){
        if(tn == null){
            return tn;
        }

        int index = 2*p+1;
        if(level < mTotalLevel){
            level++;
            tn.left = getNode(index);
            createBinaryTreeByLevel(level,index, tn.left);
            tn.right = getNode(index+1);
            createBinaryTreeByLevel(level,index+1, tn.right);

        }
        return tn;
    }
    private static void testBTLO(int [] sample){
        TreeNode root = createBinaryTree(sample);
        BinaryTreeLevelOrder bto = new BinaryTreeLevelOrder();

        List<List<Integer>> result = bto.levelOrderBottom(root);
        System.out.print("lala");
    }

    private static TreeNode getNode(int index){
        if(index >= mSample.length){
            return null;
        }
        if(mSample[index] == 0){
            return null;
        }else {
            return new TreeNode(mSample[index]);
        }
    }

    public static void test(){
        testBTLO(sample3);
    }
}
