package com.sendtomoon.data.list;

/**
 * 环形链表插值
 * 有一个整数 val，如何在节点值有序的环形单链表中插入一个节点值为 val 的节点，并且保证这个环形单链表依然有序。
 * 给定链表的信息，及元素的值 A 及对应的 nxt 指向的元素编号同时给定 val，请构造出这个环形链表，并插入该值。
 * 思路：时间复杂度 O(N)、额外空间复杂度 O(1)
 * 令 pre 节点和 cur 节点同步移动，若插入值满足大于 now 节点且小于 pre 节点则将其插入。
 * 注意考虑头尾边界。
 */
public class CircleListAddValue {

    public static void main(String[] args) {
        // 构建基本链表
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;

        for (int i = 1; i < arr.length; i++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }

    }

    public ListNode insert(int[] arr, int[] nxt, int val) {
        if (arr.length == 0) {
            return new ListNode(val);
        }

        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        ListNode ins = new ListNode(val);

        // 构建链表
        for (int i = 0; i < arr.length - 1; i++) {
            tail.next = new ListNode(arr[nxt[i]]);
            tail = tail.next;
        }

        // 插入值
        // 若插入值小于头
        if (val < head.val) {
            ins.next = head;
            return ins;
        }

        ListNode pre = head;
        ListNode now = head.next;
        while (now != null && val > now.val) {
            pre = now;
            now = now.next;
        }
        pre.next = ins;
        ins.next = now;

        return head;
    }
}
