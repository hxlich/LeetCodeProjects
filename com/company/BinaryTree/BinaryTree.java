package com.company.BinaryTree;

import com.company.Models.TreeNode;

/**
 * Created by hanh on 12/11/2014.
 */
public class BinaryTree {


    public static TreeNode createBinaryTree(int [] in){
        if (in == null || in.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(in[0]);
        int totalLevel = getTreeLevel(in.length);
        root = createBinaryTreeByLevel(1, 0, root, totalLevel, in);
        return root;
    }

    private static int getTreeLevel(int count){
        int i;
        for(i=1;count >0 ;i++){
            count -= (int)(Math.pow(2,i));
        }
        return i;
    }

    private static TreeNode createBinaryTreeByLevel(int level,int p, TreeNode tn, int totalLevel, int [] sample){
        if(tn == null){
            return tn;
        }

        int index = 2*p+1;
        if(level < totalLevel){
            level++;
            tn.left = getNode(index, sample);
            createBinaryTreeByLevel(level,index, tn.left, totalLevel,sample);
            tn.right = getNode(index+1, sample);
            createBinaryTreeByLevel(level,index+1, tn.right, totalLevel,sample);

        }
        return tn;
    }

    private static TreeNode getNode(int index, int [] sample){
        if(index >= sample.length){
            return null;
        }
        if(sample[index] == 0){
            return null;
        }else {
            return new TreeNode(sample[index]);
        }
    }
}
