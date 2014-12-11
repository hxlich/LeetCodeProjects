package com.company.BinaryTree.BalancedBinaryTree;

import com.company.Models.TreeNode;

/**
 * Created by hanh on 12/11/2014.
 */
// https://oj.leetcode.com/problems/balanced-binary-tree/
// Given a binary tree, determine if it is height-balanced.
// For this problem, a height-balanced binary tree is defined as a binary tree in which
// the depth of the two subtrees of every node never differ by more than 1.
public class BalancedBinaryTree {
    private boolean mBalanced = true;
    private int prvDepth;
    private int leafCount = 0;
    public boolean isBalanced(TreeNode root) {
        if( root == null){
            return true;
        }

        if( root.left == null && root.right == null){
            return true;
        }

        prvDepth = 0;
        naviTree(root,0);
        return mBalanced;
    }

    private int naviTree(TreeNode node, int level){
        level++;
        int leftL = level, rightL = level;

        if(node.left != null) {
            leftL = naviTree(node.left, level);
        }

        if(node.right != null) {
            rightL = naviTree(node.right, level);
        }

        if(leftL - rightL > 1 || leftL - rightL < -1){
            mBalanced = false;
        }
        int ret;
        if( leftL > rightL){
            ret = leftL;
        }else {
            ret = rightL;
        }
        return ret;
    }
}
