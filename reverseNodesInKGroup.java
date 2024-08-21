class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)
        return head;
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=head.next;
        ListNode first=null;
        ListNode nhead=null;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            ++len;
        }
        temp=head;
        int cnt=len/k;
        while(cnt>0){
            int t=k;
            if(first==null)
            first=temp;
            ListNode end=temp;
            while(t>0){
                temp.next=prev;
                prev=temp;
                temp=next;
                if(next!=null)
                next=next.next;
                --t;
            }
            if(nhead==null){
                nhead=prev;
            }
            else{
                first.next=prev;
                first=end;
            }
            --cnt;
            prev=null;
        }
        first.next=temp;
        return nhead;
    }
}
