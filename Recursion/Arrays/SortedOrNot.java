package Recursion.Arrays;


import java.util.ArrayList;

public class SortedOrNot {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6};
        int[] arr2 = {5,34,21,2,3};
//        System.out.println(isSorted(arr, 0)); // extra parameter for pointing the index.

        //linear search
        int target = 4;
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = linearSearch(arr, target, 0, list); // returns index of the target.
//        System.out.println(ans);
        System.out.println(linearSearch2(arr, 4, 0));

    }

    private static ArrayList<Integer> linearSearch2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length-1) return list;
        if(arr[index] == target) list.add(index);
//        ArrayList<Integer> BeforeAnswer = linearSearch2(arr, target, index+1);
//        list.addAll(BeforeAnswer);
        list.addAll(linearSearch2(arr, target, index+1));
        return list;

    }

    private static ArrayList<Integer> linearSearch(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length-1) return list;
        if(arr[index] == target) list.add(index);
        return linearSearch(arr, target, index+1, list);
    }

    private static boolean isSorted(int[] arr, int index) {
        if(index == arr.length -1) return true;
        if(arr[index] > arr[index+1]) return false;
        else{
            return isSorted(arr, index+1);
        }
//        return arr[index]<arr[index+1] && isSorted(arr, index+1);
    }

    public int rotatedBinarySearch(int[] arr, int start, int end, int target){
        return -1;
    }

}
