package dsa.searching;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    static void main() {
        int[] arr = new int[]{23, 4, 1, 56, 9};
        int target = 4;

        List<Integer> list = new ArrayList<>();

        // linear search



        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) {
                System.out.println(target + " element found");
            }
        }

        for(int a : arr){
            if(a == target){
                System.out.println(target + " element found");
            }
        }

        while (true){
            System.out.println("Adding");
            list.add(5);
            linearSearch(list, 3);
        }
    }


    public static void linearSearch(List<Integer> list, int target){
        System.out.println("Searching");
        for(Integer a : list){
            if(a == target){
                System.out.println("Element found");
            }
        }
    }
}
