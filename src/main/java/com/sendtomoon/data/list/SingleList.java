package com.sendtomoon.data.list;

/**
 * 单链表测试
 */
public class SingleList<T> {

    private int size;
    private int MAX_SIZE = 9999999;
    private Node first;

    public SingleList() {
        first = new Node(null, null);
        size = 0;
    }

    public void add(T t) {
        Node temp = first;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        Node t2 = new Node(t, null);
        temp.setNext(t2);
        ++size;
    }

    public T get(int pos) {
        Node<T> temp = first;
        for (int i = 0; i <= pos; i++) {
            temp = temp.getNext();
        }
        return temp.getT();
    }


    @Override
    public String toString() {
        return "SingleList{" +
                "first=" + first +
                '}';
    }

    /**
     * 链表的节点
     *
     * @param <T>
     */
    class Node<T> {
        private T t;
        private Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "t=" + t +
                    ", next=" + next +
                    '}';
        }

        Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
