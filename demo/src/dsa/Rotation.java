package dsa;

import java.util.Arrays;

public class Rotation {
    static void main() {
        int[] arr = new int[]{1,2,3,4,5};
        antiClockWiseRotateArr(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void clockWiseRotateArr(int[] arr, int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    static void antiClockWiseRotateArr(int[] arr, int d) {
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
    }


    static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
