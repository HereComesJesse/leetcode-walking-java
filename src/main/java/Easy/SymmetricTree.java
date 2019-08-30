/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Easy;

/**
 * @author zhangjundong
 * @date 2019/8/3018:44
 */
public class SymmetricTree {
    /**
     * Description:
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     *
     * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
     * But the following [1,2,2,null,3,null,3] is no
     *
     * Time Complexity:O(N)    Space Complexity:O(N)
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return isSameTree(root.left,root.right);
    }

    public boolean isSameTree(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val !=right.val){
            return false;
        }
        return isSameTree(left.left,right.right)
                && isSameTree(left.right,right.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(2);
        treeNode.left.left=new TreeNode(3);
        treeNode.left.right=new TreeNode(4);
        treeNode.right.left=new TreeNode(4);
        treeNode.right.right=new TreeNode(3);
        boolean output= new SymmetricTree().isSymmetric(treeNode);
        System.out.println(output);
    }
}
