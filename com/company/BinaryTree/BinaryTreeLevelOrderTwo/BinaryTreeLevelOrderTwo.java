package com.company.BinaryTree.BinaryTreeLevelOrderTwo;

import com.company.Models.TreeNode;

import java.util.ArrayList;
import java.util.List;

// accepted
public class BinaryTreeLevelOrderTwo {

    private List<List<Integer>> mResult = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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

    private List<List<Integer>> reverseList(List<List<Integer>> l){
        int i = l.size()/2;
        int max = l.size()-1;
        List<Integer> tl = null;
        for(int j = 0; j< i; j++){
            tl = l.get(j);
            l.set(j,l.get(max-j));
            l.set(max-j,tl);
        }
        return l;
    }

}
