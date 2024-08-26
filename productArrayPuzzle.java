class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int n = nums.length;
        long[] result = new long[n];

        // Step 1: Initialize result array to store the product of elements to the left of each index
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Traverse the array from right to left while updating the result array
        long rightProduct = 1; // This variable will store the product of elements to the right of the current index
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        long[] result = productExceptSelf(nums);

        // Print the result array
        for (long value : result) {
            System.out.print(value + " ");
        }
    }
}
