package com.srm.cjava.wk02.day10;


public class Algorithmm {
    int binarySearch(int array[], int x, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
         
        Algorithmm ob = new Algorithmm();
        int array[] = { 7, 8, 5, 9, 3, 4, 96 };
        int n = array.length;
       System.out.println("BINARY SEARCH HAS BEEN DONE!");
        int result = ob.binarySearch(array, 99, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
      
    }
}
