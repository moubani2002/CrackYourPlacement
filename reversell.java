//Rverse a linked list


class Solution {
    public ListNode reverseList(ListNode head) {
        
        return reverse (head,null);
    }
    ListNode reverse (ListNode current, ListNode prev){
        if (current == null){
            return prev;
        }
        ListNode next = current.next;
        current.next = prev;
        return reverse(next,current);
    }
}