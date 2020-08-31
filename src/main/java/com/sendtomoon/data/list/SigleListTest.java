package com.sendtomoon.data.list;

public class SigleListTest {
    public static void main(String[] args) {
        SingleList<String> list = new SingleList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
