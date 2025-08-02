class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }

        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // An element is a leader if it's greater than or equal to the max element on its right
            if (arr[i] >= maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i]; // Update the max element for the next iteration
            }
        }
        
        // The leaders are found in reverse order, so we need to reverse the list
        Collections.reverse(leaders);

        return leaders;
    }
}
