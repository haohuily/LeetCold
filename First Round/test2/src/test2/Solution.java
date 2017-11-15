package test2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val == 0) return l2;
        if(l2.val == 0) return l1;
        int sum, carry = 0;
        //ListNode head1 = l1;
        //ListNode head2 = l2;
        
        while(l1.next != null || l2.next != null){
        	if(l1.val+l2.val+carry>=10){
        		l1.val = l1.val+l2.val+carry-10;
        		carry = 1;
        		l1 = l1.next;
        		l2 = l2.next;      		
        	} 	
        }
    	if(l1.next == null && carry !=0)
    		l1.next.val = l2.next.val+carry;
    	if(l2.next == null && carry !=0)
    		l1.next.val = l1.next.val+carry;      
        return l1;
    }
}
