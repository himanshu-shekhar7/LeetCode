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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        while(temp != null){
            ListNode start = temp;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < k ; i++){
                if(temp == null) return head;
                list.add(temp.val);
                temp = temp.next;
            }
            for(int i = k - 1; i >= 0 ; i--){
                start.val = list.get(i);
                start = start.next;
            }
        }
        return head;
    }
}