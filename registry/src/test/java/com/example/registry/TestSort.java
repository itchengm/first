package com.example.registry;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestSort {
    public static void main(String [] args) {
        int[] arr = {324,44,243,5435,23,123,5,4432,7};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        Map map0 = new HashMap();
        map0.put(null,null);
        System.out.println(map0.get(null));
        Map map = new ConcurrentHashMap();





        Map map1 = new Hashtable();

        List<String> list = new ArrayList<String>();

        for(int i = 0;i<100;i++) {



            list.add("aa"+i);
        }
    }
    public static void sort(int[] arr, int start, int end) {
        if(start>=end) {
            return;
        }
        int mid = (start+end)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);

    }
    public static void merge(int[] arr, int start, int mid, int end) {
        int [] temp = new int[end-start+1];
        int a = start;
        int b = mid+1;
        int tIndex = 0;
        while (a<=mid && b<=end) {
            if(arr[a]<arr[b]) {
                temp[tIndex++] = arr[a++];
            }else{
                temp[tIndex++] = arr[b++];
            }
        }
        while(a<=mid) {
            temp[tIndex++] = arr[a++];
        }
        while (b<=end) {
            temp[tIndex++] = arr[b++];
        }
        for (int i=0;i<tIndex;i++) {
            arr[start+i] = temp[i];
        }
    }

}
