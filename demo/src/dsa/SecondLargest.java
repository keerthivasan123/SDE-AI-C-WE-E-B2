package dsa;

public class SecondLargest {
    static void main() {
        int arr[] = new int[]{10, 2, 5, 15, 11, 100};
        int firstLargest = -1, secondLargest = -1;
        for(int num : arr){
            if(num > firstLargest){
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest){
                secondLargest = num;
            }
        }

        System.out.println("First Largest : " + firstLargest);
        System.out.println("Second Largest : " + secondLargest);
    }
}
