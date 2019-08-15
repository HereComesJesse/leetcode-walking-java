/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Array;

/**
 * @author zhangjundong
 * @date 2019/8/1523:48
 */
public class MergeTwoSortedLists {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x;}
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode listNode=new ListNode(0);
        ListNode mid=listNode;
        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                mid.next=l1;
                l1=l1.next;
            }
            else{
                mid.next=l2;
                l2=l2.next;
            }
            mid=mid.next;
        }
        if(l1!=null){
            mid.next=l1;
        }
        else if(l2!=null){
            mid.next=l2;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        listNode1.next=new ListNode(2);
        listNode1.next.next=new ListNode(4);

        ListNode listNode2=new ListNode(1);
        listNode2.next=new ListNode(3);
        listNode2.next.next=new ListNode(4);

        ListNode listNode3= new MergeTwoSortedLists().mergeTwoLists(listNode1,listNode2);
    }
}
