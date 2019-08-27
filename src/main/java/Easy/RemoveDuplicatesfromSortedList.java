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
 * @date 2019/8/2719:58
 */
public class RemoveDuplicatesfromSortedList {

    /**
     * Description:
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     *
     * Time Complexity:O(n)     Space Complexity:O(1)
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head){
        ListNode current=head;
        while (current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(1);
        listNode.next.next=new ListNode(2);
        listNode.next.next.next=new ListNode(3);
        listNode.next.next.next.next=new ListNode(3);
        ListNode result= new RemoveDuplicatesfromSortedList().deleteDuplicates(listNode);
    }
}

