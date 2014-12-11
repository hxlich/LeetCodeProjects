package com.company.BinaryTree.MinDepthBinaryTree;

import com.company.Models.TreeNode;

/**
 * Created by hanh on 12/11/2014.
 */
// https://oj.leetcode.com/problems/minimum-depth-of-binary-tree/
// Given a binary tree, find its minimum depth.
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
public class MinDepthBinaryTree {
    private int mMinDepths;
    public int minDepth(TreeNode root) {
        if( root == null){
            return 0;
        }

        if( root.left == null && root.right == null){
            return 1;
        }

        mMinDepths = Integer.MAX_VALUE;
        naviTree(root,0);

        return mMinDepths;
    }

    private void naviTree(TreeNode node, int level){
        level++ ;

        // a leaf
        if(node.left == null && node.right == null){
            if(level < mMinDepths){
                mMinDepths = level;
            }
            return;
        }

        if(node.left != null){
            naviTree(node.left, level);
        }

        if(node.right != null){
            naviTree(node.right, level);
        }

    }
}
