package sort.binary;

public class BinarySearch {

    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int middle;
        while (left <= right) {
            middle = left + ((left - right) / 2);

            if (arr[middle] == target) {
                return middle;
            }

            if (arr[middle] < target) {
                left = left + 1;
            } else {
                right = right - 1;
            }
        }
        return  -1;
    }
}
