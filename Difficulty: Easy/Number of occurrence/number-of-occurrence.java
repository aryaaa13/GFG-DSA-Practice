class Solution {
    int countFreq(int[] arr, int target) {
       int n = arr.length;
        int firstIdx = -1;
        int lastIdx = -1;
        
        
        for (int i = 0; i < 2; i++) {
            int low = 0;
            int high = n - 1;
            int currentIdx = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    currentIdx = mid;
                    if (i == 0) { // First pass: find the first occurrence
                        high = mid - 1;
                    } else { // Second pass: find the last occurrence
                        low = mid + 1;
                    }
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (i == 0) {
                firstIdx = currentIdx;
            } else {
                lastIdx = currentIdx;
            }
        }
        
        // If firstIdx is -1, the target was not found in the array.
        if (firstIdx == -1) {
            return 0;
        }

        // The frequency is the number of elements from firstIdx to lastIdx, inclusive.
        return lastIdx - firstIdx + 1;
    }
}