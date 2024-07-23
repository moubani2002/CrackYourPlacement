//Find Pair Given Difference

class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        for(int num:arr){
            if (seen.contains(num + x) || seen.contains(num - x)){
                return 1;
            }
            seen.add(num);
        }
        return -1;
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int[] arr = {5, 20, 3, 2, 5, 80};
        int x = 78;
        int n = arr.length;
        int result = solution.findPair(n, x, arr);
        System.out.println(result);
    }
}
