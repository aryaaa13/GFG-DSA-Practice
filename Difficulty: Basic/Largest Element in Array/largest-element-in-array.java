class Solution {
    public static int largest(int[] arr) {

        int n = arr.length;
        
        if (n==0){
            return -1;
        }
        int largest = arr[0];
        
        for ( int i = 1; i < n ; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
