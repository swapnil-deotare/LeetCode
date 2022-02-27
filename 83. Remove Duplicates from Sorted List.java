/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy= head;
        if(head!=null){
            ListNode temp = head.next;

            while(head.next!=null){
               // System.out.println("Head is processing:" + head.val);
               // System.out.println("Temp is processing:" + temp.val);
                if( temp!= null && head.val == temp.val){
                    temp= temp.next;
                    
                }else{
                    head.next=temp;
                    head=head.next;
                    if(temp==null)
                        break;
                    temp= temp.next;
                }

            }
        }
        return dummy;
    }
}