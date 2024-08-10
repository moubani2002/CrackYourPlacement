//Palindrome linked list


class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode save = head;

        while (save != null) {
            stack.push(save.val);
            save = save.next;
        }
        save = head;
        while (save != null) {
            if (save.val != stack.pop()) {
                return false;
            }
            save = save.next;
        }

        return true;
    }
}