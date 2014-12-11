package com.company.BinaryTree.BinaryTreeLevelOrder;

import com.company.Models.TreeNode;

import java.util.ArrayList;
import java.util.List;

// accepted
// https://oj.leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrder {

    private List<List<Integer>> mResult = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return mResult;
        }

        naviTree(root,1);

        return mResult;
    }

    private void naviTree(TreeNode root, int level){
        addToResult(level,root.val);
        if(root.left != null || root.right != null){
            level++;
        }

        if(root.left != null){
            naviTree(root.left,level);
        }

        if(root.right != null){
            naviTree(root.right,level);
        }
    }

    private void addToResult(int level, int val){
        List<Integer> l = null;
        if(mResult.size() < level){
            l = new ArrayList<Integer>();
            mResult.add(l);
        }else {
            l = mResult.get(level-1);
        }

        l.add(val);
    }
}
