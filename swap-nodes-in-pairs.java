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

//Recursive Solution
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        swap(dummy);
        return dummy.next;
    }
    
    void swap(ListNode node) {
        if(node == null) {
            return;
        }
        ListNode firstNode = node.next;
        
        ListNode secondNode = null;
        if(firstNode != null) {
            secondNode = firstNode.next;
        }
        
        if(secondNode != null) {
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            node.next = secondNode;
            swap(firstNode);
        }
    }
}

//Iterative Solution
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode node = dummy;
        while(node != null) {
            ListNode firstNode = node.next;
        
            ListNode secondNode = null;
            if(firstNode != null) {
                secondNode = firstNode.next;
            }
        
            if(secondNode != null) {
                firstNode.next = secondNode.next;
                secondNode.next = firstNode;
                node.next = secondNode;
                node = firstNode;
            } else {
                break;
            }
        }
        
        return dummy.next;
    }
}


