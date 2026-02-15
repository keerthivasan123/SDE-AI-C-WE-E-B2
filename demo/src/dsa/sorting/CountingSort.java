package dsa.sorting;

import java.util.Arrays;

public class CountingSort {
    static void main() {
        int[] arr = new int[]{4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countingSort(int[] arr){
        int maxElement = Arrays.stream(arr).max().getAsInt(); // n
        int[] count = new int[maxElement+1];

        // calculate freq
        for(int a : arr){ // n
            count[a]++;
        }

        // prefix sum
        for(int i=1; i<count.length; i++){ // k
            count[i] += count[i-1];
        }

        // sorting
        int[] output = new int[arr.length]; // n
        for(int i=arr.length-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length); // n
    }
}
