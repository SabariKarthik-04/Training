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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode res = new ListNode();
        ListNode cur = res;
        int c= 0;

        while(l1!=null || l2!=null || c!=0){
            int v1 = l1==null? 0:l1.val;
            int v2 = l2==null? 0:l2.val;
            int sum = v1+v2+c;
            cur.next = new ListNode(sum%10);
            c = sum/10;

            l1 = (l1!=null)? l1.next:null;
            l2 = (l2 != null) ? l2.next:null;
            cur=cur.next;
        }
        return res.next;
         
    }
}