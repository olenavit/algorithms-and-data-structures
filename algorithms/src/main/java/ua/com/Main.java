package ua.com;

import java.lang.reflect.Array;
import java.util.*;

import static ua.com.SortingDirection.ASC;
import static ua.com.SortingDirection.DESC;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        SortArray.bubbleSort(arr, DESC);
        System.out.println(Arrays.toString(arr));
        SortArray.bubbleSort(arr, ASC);
        System.out.println(Arrays.toString(arr));
    }





}
