//Permutations in array

class Solution {
    public Boolean isPossible(long[] a, long[] b, int n, long k) {
        // Sort array a in ascending order
        Arrays.sort(a);

        // Sort array b in descending order
        Arrays.sort(b);
        for (int i = 0; i < n / 2; i++) {
            long temp = b[i];
            b[i] = b[n - 1 - i];
            b[n - 1 - i] = temp;
        }

        // Check if the sum of corresponding elements is greater than or equal to k
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        long[] a = {2, 1, 3};
        long[] b = {7, 8, 9};
        int n = 3;
        long k = 10;
        
        System.out.println(sol.isPossible(a, b, n, k)); // Output: true
    }
}