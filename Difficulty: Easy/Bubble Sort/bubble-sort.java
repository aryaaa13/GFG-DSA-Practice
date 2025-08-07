class Solution {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // The last i elements are already in place, so we don't need to check them.
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next element, swap them.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in the inner loop, the array is sorted.
            if (!swapped) {
                break;
            }
        }
    }
}
        
   