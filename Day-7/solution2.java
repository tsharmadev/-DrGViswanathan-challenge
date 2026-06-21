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
    public ListNode rotateRight(ListNode head, int k) {  
     if (head == null || head.next == null || k == 0) {
            return head;
     }
    ListNode tail=head;
    int l=1;
    while(tail.next!=null){
        tail=tail.next;
        l++;
    }
    tail.next=head;
    k=k%l;
    int d=l-k-1;
    ListNode node=findNode(head,d);
    head=node.next;
    node.next=null;
    return head;
    }

    ListNode findNode(ListNode head ,int d){
        ListNode temp=head;
        while(d!=0){
            d--;
            temp=temp.next;
        }
        return temp;
    }
    
}