class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode forward = head, backward =head, tempback;
        
        int i = 1;
        while(forward!=null && i<k){
            forward=forward.next;
            i++;
        }
        
        tempback = forward;
        
        while(true && forward!=null){
            forward=forward.next;
            if(forward!=null) backward=backward.next;
        }
        
        int swap = tempback.val;
        tempback.val = backward.val;
        backward.val = swap;
        
        return head;
    }
}