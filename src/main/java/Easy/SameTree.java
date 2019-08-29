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
 * @date 2019/8/2920:15
 */
public class SameTree {

    /**
     * Description:
     * Given two binary trees, write a function to check if they are the same or not.
     *
     * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
     *
     * Time Complexity:O(n)    Space Complexity:O(log(N))  ||   O(N)
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)
                && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        p.left=new TreeNode(2);
        p.right=new TreeNode(3);

        TreeNode q=new TreeNode(1);
        q.left=new TreeNode(2);
        q.right=new TreeNode(3);
        Boolean output= new SameTree().isSameTree(p,q);
    }
}
