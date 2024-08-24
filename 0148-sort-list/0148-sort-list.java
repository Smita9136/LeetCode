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
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right =sortList(mid);
        return mergeList(left,right);
        
    }

    public ListNode mergeList(ListNode list1,ListNode list2){
        ListNode dummyhead=new ListNode();
        ListNode temp=dummyhead;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else{
                 temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }

        while(list1!=null){
              temp.next=list1;
                list1=list1.next;
                temp=temp.next;

        }
          while(list2!=null){
              temp.next=list2;
                list2=list2.next;
                temp=temp.next;

        }
        return dummyhead.next;
    }

    public ListNode getMid(ListNode head){
        // ListNode slow=head;
        // ListNode fast=head;

        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        // return slow;

        ListNode midP=null;
        while(head!=null && head.next!=null){
            midP=(midP==null)?head:midP.next;
            head=head.next.next;
        }
        ListNode mid=midP.next;
        midP.next=null;
        return mid;
    }
}