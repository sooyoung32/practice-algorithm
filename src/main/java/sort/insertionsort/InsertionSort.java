package sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] arr = {5,3,7,4,2};
        sort.sort(arr);
    }

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i  - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
