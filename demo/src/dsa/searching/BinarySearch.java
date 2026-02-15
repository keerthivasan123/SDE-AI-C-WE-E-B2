package dsa.searching;

public class BinarySearch {
    static void main() {
        int[] arr = new int[]{1, 4, 5, 64, 322, 1000};
        if(binarySearch(arr, 1000)){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

    static boolean binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return true;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
