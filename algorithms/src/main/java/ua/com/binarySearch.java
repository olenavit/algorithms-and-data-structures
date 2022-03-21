package ua.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class binarySearch {
    public static int search(int valueNeedToFind, int[] masSearch){
         Arrays.sort(masSearch);
         int start = 0;
         int end = masSearch.length-1;
         while (start<=end) {
             int middle = (start + end)/2;
             if(masSearch[middle]==valueNeedToFind) return middle;
             else if(masSearch[middle]>valueNeedToFind) end=middle-1;
             else start=middle+1;
         }
         return -1;
    }
}
