package leetcode;

import org.junit.Test;

//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
public class No19 {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    @Test
    public void test01(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        removeNthFromEnd(head,1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        ListNode temp1 = head;
        int count1 = count;
        if(n == count){
            return head.next;
        }
        else if(n == 1){
            while (count1 > 2){
                temp1 = temp1.next;
                count1--;
            }
            temp1.next = null;
            return head;
        }
        else{
            while (count > n+1){
                temp1 = temp1.next;
                count1--;
            }
            temp1.next = temp1.next.next;
            return head;
        }
    }
}
