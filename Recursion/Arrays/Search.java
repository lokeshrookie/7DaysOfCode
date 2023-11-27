package Recursion.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0,1,2};

        //algo
        int pivot = findPivot(arr);
        int targetIndex = rotatedBinary(arr, 0, arr.length-1, 3);
        System.out.println(targetIndex);




//
//        System.out.println(targetIndex);
//        System.out.println(findPivot(arr));
    }

    private static int rotatedBinary(int[] arr, int start, int end, int target ) {
        if(start>end) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid] == target) return  mid;

        if(arr[start] < arr[mid]){ // left array is sorted.
            if(target >= arr[start] && target <=arr[mid]){
                return rotatedBinary(arr,0, mid, target);
            }
            else{
                return rotatedBinary(arr, mid+1, end, target);
            }
            
        }
        else{ // right side array is sorted.
            if(target > arr[mid] && target<=arr[end]){
                return rotatedBinary(arr, mid+1, end, target);
            }
            else{
                return rotatedBinary(arr, start, mid, target);
            }
            
        }

    }

    private static int findPivot(int[]arr){
        int pivot = 0;
        for (int i= 1; i <arr.length ; i++) {
            if(arr[i] < arr[i-1]){
                pivot = i;
            }
        }
        return pivot;
    }
}
