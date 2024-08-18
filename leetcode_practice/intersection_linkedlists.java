public class intersection_linkedlists {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode first =headA;
       ListNode second =headB;

       while(first!=second){
           first=first.next;
           second=second.next;

           if(first==second)   return first;

           if(first==null)
               first=headB;
           if(second==null)
               second=headA;
       }
       return first;
   }
} 
    
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}