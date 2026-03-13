class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1 ;
        ListNode temp2 = list2 ;
        ListNode demo = new ListNode() ;
        ListNode curr = demo ;

        while(temp1 != null && temp2 != null)
        {
           
           if(temp1.val > temp2.val)
           {
              curr.next = temp2 ;
              temp2 = temp2.next ;
           }
           else
           {
            curr.next = temp1 ;
            temp1 = temp1.next ;
           }

           curr = curr.next ;
        }

        if(temp1 == null)
        {
            curr.next = temp2 ;
        }

        if(temp2 == null)
        {
            curr.next = temp1 ;
        }

        return demo.next ;
        
    }
}
