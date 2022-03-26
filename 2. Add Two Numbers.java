class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode();
        ListNode next = head;
        int sum, carry=0;
        while(true){
            sum=0;
           
            
            if(l1!=null){
                sum = sum + l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                sum = sum + l2.val;
                l2=l2.next;
            }
            
            sum = sum+carry;
            if(sum>9){
                carry = sum/ 10;
                sum = sum %10;
            }else{
                carry = 0;
            }
            //System.out.println(sum);
            next.val= sum;
            if(l1!=null || l2!=null){
               
                next.next = new ListNode();
                next = next.next;
            }else if(l1==null &&  l2==null && carry!=0){
                next.next = new ListNode();
                next.next.val = carry;
                break;
            }else{
                break;
            }
        }
        
      
        
        return head;
    }
}