package test21;



public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        
        ListNode merged = null;
        if(l1.val <= l2.val){
        	merged = l1;
        	merged.next = mergeTwoLists(l1.next, l2);
        }
        
        else if(l1.val > l2.val){
        	merged = l2;
        	merged.next = mergeTwoLists(l2.next, l1);
        }
        
       return merged;
    }
}