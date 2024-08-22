class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        // If there are no students or packets
        if (m == 0 || n == 0) {
            return 0;
        }

        // If the number of students is more than the number of packets
        if (n < m) {
            return -1; // not enough packets
        }

        // Sort the ArrayList
        Collections.sort(a);

        // Initialize the minimum difference as a large number
        long min_diff = Long.MAX_VALUE;

        // Find the minimum difference between max and min in subarrays of size M
        for (int i = 0; i <= n - m; i++) {
            long diff = a.get(i + m - 1) - a.get(i);
            if (diff < min_diff) {
                min_diff = diff;
            }
        }

        return min_diff;
    
    }
}
