package com.sendtomoon.data.list;


public class Bianli {

    /**
     * 求单链表中节点个数
     */
    public int count(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (true) {
            if (temp.next == null)
                return size;
            size++;
            temp = temp.next;
        }
    }

    /**
     * 单链表反转
     */
    public void rever(ListNode head){
        ListNode next = head;
        ListNode pre = head;

    }
}
