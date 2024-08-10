//Smallest Psitive Missing Number

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int n = size;

        // Step 1: Place each positive number in its correct position
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers from 1 to n are present, return n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        int missing = missingNumber(arr, size);
        System.out.println(missing);
    }
}