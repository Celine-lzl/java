package www.bittech;
// 删除链表中某一个数
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        while(cur.next != null){
            if(cur.next.val != val){
                cur = cur.next;
            }else{
                cur.next = cur.next.next;
            }
        }
        if(head.val ==val){
            return head.next;
        }else{
            return head;
        }
    }
}

