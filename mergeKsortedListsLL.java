class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode curr=lists[i];
            while(curr!=null){
                a.add(curr.val);
                curr=curr.next;
            }
        }
       Collections.sort(a);
       ListNode h=new ListNode(-1);
       ListNode curr=h;
       for(int i=0;i<a.size();i++){
        ListNode tmp=new ListNode(a.get(i));
        curr.next=tmp;
        curr=curr.next;
       }
       return h.next;
    }
}
