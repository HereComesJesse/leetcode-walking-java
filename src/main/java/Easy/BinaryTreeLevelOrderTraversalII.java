/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Easy;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhangjundong
 * @date 2019/9/220:36
 */
public class BinaryTreeLevelOrderTraversalII {

    /**
     * Description:
     *Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> wrapList=new LinkedList<List<Integer>>();
        if(root==null){
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> subList=new LinkedList<Integer>();
            for (int i=0;i<levelNum;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            wrapList.add(0,subList);
        }
        return wrapList;
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(3);
        treeNode.left=new TreeNode(9);
        treeNode.right=new TreeNode(20);
        treeNode.right.left=new TreeNode(25);
        treeNode.right.right=new TreeNode(7);
        List<List<Integer>> output= new BinaryTreeLevelOrderTraversalII().levelOrderBottom(treeNode);
    }
}
