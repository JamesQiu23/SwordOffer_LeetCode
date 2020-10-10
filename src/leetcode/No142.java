package leetcode;

/*
142. 环形链表 II
给定一个链表，返回链表开始入环的第一个节点。如果链表无环，则返回 null。
为了表示给定链表中的环，我们使用整数pos来表示链表尾连接到链表中的位置（索引从 0 开始）。
如果 pos 是 -1，则在该链表中没有环。
*/

import java.util.HashSet;
import java.util.Set;

public class No142 {

}

class Solution142 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = head;
        if (head == null){
            return null;
        }
        while (temp != null){
            if (set.add(temp) == false){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}


