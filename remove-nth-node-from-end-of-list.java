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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        
        int position = count - n;
        temp = head;
        while(position>1) {
            temp = temp.next;
            position--;
        }
        if(count == n) {
            head = temp.next;
        } else if (temp.next == null) {
            head = null;
        } else {
            temp.next = temp.next.next;
        }
        return head;
    }
}
