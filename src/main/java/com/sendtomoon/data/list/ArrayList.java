package com.sendtomoon.data.list;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = Arrays.copyOf(a1,99);
        System.out.println(a2.length);
    }
}
