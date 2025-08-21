class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1; // n is the total number of elements including the missing one
        
        // Step 1: Calculate the expected sum of numbers from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;
        
        // Step 2: Calculate the actual sum of the elements in the array
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // Step 3: The difference is the missing number
        return (int) (expectedSum - actualSum);
    }
}
        
  