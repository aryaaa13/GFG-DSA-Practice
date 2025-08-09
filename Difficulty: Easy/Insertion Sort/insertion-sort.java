class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
         int n = arr.length;
        // The outer loop iterates from the second element to the end of the array.
        // It treats the elements up to 'i-1' as the sorted part.
        for (int i = 1; i < n; i++) {
            // Store the current element to be inserted into the sorted part.
            int key = arr[i];
            
            // 'j' is a pointer to the last element of the sorted part.
            int j = i - 1;
            
            // Move elements of arr[0...i-1] that are greater than the key
            // one position ahead of their current position.
            // This loop shifts elements to the right to make space for the key.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            // Insert the key into its correct position in the sorted part.
            arr[j + 1] = key;
        }
    }
      
}  
