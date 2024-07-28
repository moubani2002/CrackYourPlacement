// Permute two arrays such that sum of every pair is greater or equal to k
import java.util.*;

class solution {
    static boolean isPossible(Integer a[], int b[], int n, int k) {
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);

        // Checking condition on each index.
        for (int i = 0; i < n; i++)
        if (a[i] + b[i] < k)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Integer a[] = {2, 1, 3};
        int b[] = {7, 8, 9};
        int k = 10;
        int n = a.length;

        if (isPossible(a, b, n, k))
        System.out.print("Yes");
        else
        System.out.print("No");
    }
}