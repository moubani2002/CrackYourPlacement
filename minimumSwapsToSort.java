// Minimum number of swaps required to sort the array

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        // Create a sorted copy of the array
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        // Create a map to store the index of each element in the sorted array
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(sortedNums[i], i);
        }
        
        // Track visited elements
        boolean[] visited = new boolean[n];
        int swapCount = 0;
        
        for (int i = 0; i < n; i++) {
            // If already visited or already in the correct position
            if (visited[i] || sortedNums[i] == nums[i]) {
                continue;
            }
            
            // Calculate the cycle size
            int cycleSize = 0;
            int x = i;
            
            while (!visited[x]) {
                visited[x] = true;
                x = indexMap.get(nums[x]);
                cycleSize++;
            }
            
            // If the cycle size is greater than 1, add the number of swaps
            if (cycleSize > 1) {
                swapCount += (cycleSize - 1);
            }
        }
        
        return swapCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 3, 2, 1};
        System.out.println(sol.minSwaps(nums));
    }
}