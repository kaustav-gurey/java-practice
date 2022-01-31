package com.kaustav.arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 6, 89, 6, 34, 89, 10};
        System.out.println(found(arr,6,0));
        System.out.println(found(arr,10,0));
        System.out.println(found(arr,99,0));

        System.out.println();

        System.out.println(findIndexFromFirst(arr,6,0));
        System.out.println(findIndexFromFirst(arr,10,0));
        System.out.println(findIndexFromFirst(arr,99,0));

        System.out.println();

        System.out.println(findIndexFromLast(arr,6,arr.length-1));
        System.out.println(findIndexFromLast(arr,10,arr.length-1));
        System.out.println(findIndexFromLast(arr,99,arr.length-1));

        System.out.println();

        findAllIndex(arr,6,0);

        System.out.println();

        findAllIndexAndStore(arr,6,0);
        //this will also show the values stored while calling the method in the previous line
        findAllIndexAndStore(arr,34,0);

        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndexAndStore2(arr,6,0,list));

        System.out.println();
        System.out.println(findAllIndexAndStore3(arr,6,0));
    }
    //checks if the element to be found is in the array or not
    static boolean found(int[] arr, int target, int index) {
        /*if the index is in arr.length i.e has crossed arr.length-1(last index of the array)
        then the element wasn't found in the array*/
        if(index==arr.length) {
            return false;
        }
        //return true if the element in the index==target or the element is present in the rest of the array
        return arr[index]==target || found(arr,target, index+1);
    }
    //finds the index of the target element if found in the array from the beginning i.e. 0
    static int findIndexFromFirst(int[] arr, int target, int index) {
        /*if the index is in arr.length i.e has crossed arr.length-1(last index of the array)
        then the element wasn't found in the array*/
        if(index==arr.length) {
            return -1;
        }
        //if element==target then return index
        if(arr[index]==target) {
            return index;
        }
        //else search the rest of the array
        return findIndexFromFirst(arr,target,index+1);
    }
    //finds the index of the target element if found in the array from the end i.e. arr.length-1
    static int findIndexFromLast(int[] arr, int target, int index) {
        /*if the index is in arr.length i.e has crossed arr.length-1(last index of the array)
        then the element wasn't found in the array*/
        if(index==-1) {
            return -1;
        }
        //if element==target then return index
        if(arr[index]==target) {
            return index;
        }
        //else search the rest of the array
        return findIndexFromLast(arr,target, index-1);
    }
    //finds all the index places of the target in the array
    static void findAllIndex(int[] arr, int target, int index) {
        //index==arr.length i.e. index has crossed the last index(arr.length=1) so get out of the function
        if(arr[index]==arr.length) {
            System.out.println();
            return;
        }
        //if target==arr[index] then print the index
        if(arr[index]==target) {
            System.out.print(index+" ");
        }
        //search in the remaining array
        findAllIndex(arr,target,index+1);
    }
    //finds all the index places of the target in the array and stores in an Arraylist
    /*this method is flawed because once the method is called some values are stores in the arraylist
    the next time the method is called the old values remain the arraylist*/
    //fixed in findAllIndexAndStore2 and findAllIndexAndStore3
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndexAndStore(int[] arr, int target, int index) {
        //index==arr.length i.e. index has crossed the last index(arr.length=1) so get out of the function
        if(arr[index]==arr.length) {
            System.out.println(list);
            return;
        }
        //if target==arr[index] then add teh value of index in the Arraylist
        if(arr[index]==target) {
            list.add(index);
        }
        //search in the remaining array
        findAllIndexAndStore(arr,target,index+1);
    }
    //finds all the index places of the target in the array and stores in an Arraylist
    //but in this method you have to create an empty ArrayList and pass is as a parameter everytime
    //fixed in findAllIndexAndstore3
    static ArrayList findAllIndexAndStore2(int[] arr, int target, int index, ArrayList list) {
        //index==arr.length i.e. index has crossed the last index(arr.length=1) so get out of the function
        if(arr[index]==arr.length) {
            return list;
        }
        //if target==arr[index] then add teh value of index in the Arraylist
        if(arr[index]==target) {
            list.add(index);
        }
        //search in the remaining array
        return findAllIndexAndStore2(arr,target,index+1,list);
    }
    //finds all the index places of the target in the array and stores in an Arraylist without passing it as a parameter
    static ArrayList findAllIndexAndStore3(int[] arr, int target, int index) {
        //create a new Arraylist
        ArrayList<Integer> list = new ArrayList<>();
        //index==arr.length i.e. index has crossed the last index(arr.length=1) so get out of the function
        if(arr[index]==arr.length) {
            return list;
        }
        //if target==arr[index] then add teh value of index in the newly created Arraylist
        if(arr[index]==target) {
            list.add(index);
        }
        //create another new arraylist and store the values by searching the remaining of the index in it
        ArrayList<Integer> restList = findAllIndexAndStore3(arr,target,index+1);
        //add the old values to the ArrayList with the new value
        list.addAll(restList);
        //return the list with teh old and the new values
        return list;
    }
}