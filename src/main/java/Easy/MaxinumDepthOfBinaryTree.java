/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Easy;

import sun.reflect.generics.tree.Tree;

/**
 * @author zhangjundong
 * @date 2019/8/3123:19
 */
public class MaxinumDepthOfBinaryTree {

    /**
     * Description:
     * Given a binary tree, find its maximum depth.
     *
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * Note: A leaf is a node with no children.
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(3);
        treeNode.left=new TreeNode(9);
        treeNode.right=new TreeNode(20);
        treeNode.right.left=new TreeNode(15);
        treeNode.right.right=new TreeNode(7);
        int output= new MaxinumDepthOfBinaryTree().maxDepth(treeNode);
        System.out.println(output);
    }
}
