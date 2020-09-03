package com.sendtomoon.data;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,23,26,29,33,39,66,99,888,99999,65464684};
        search(array,18);
    }


    public static void search(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (value == array[middle]) {
                System.out.println(middle+":"+array[middle]);
                return;
            }
            if (value > array[middle]) {
                start = middle + 1;
            }
            if (value < array[middle]) {
                end = middle - 1;
            }
        }
    }
}
