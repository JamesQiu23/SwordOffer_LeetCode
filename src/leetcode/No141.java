package leetcode;

/*给定一个链表，判断链表中是否有环。
如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
*/

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No141 {
}


class Solution141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //解法一：使用快慢指针
    public boolean hasCycle1(ListNode head) {
        /*ListNode quick = head;
        ListNode slow = head;
        if (head == null || head.next==null){
            return false;
        }
        while (quick!=null || quick.next!=null){
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow){ //不必判断slow为空，因为slow为空则quick必为空
                return true;
            }
        }*/

        ListNode quick = head;
        ListNode slow = head;
        if (head == null || head.next==null){
            return false;
        }
        while (quick!=null && quick.next!=null){ //注意：之前是||才导致的错误
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow){ //不必判断slow为空，因为slow为空则quick必为空
                return true;
            }
        }

        return false;
        /*bool hasCycle(ListNode *head) {
            ListNode* fast = head;
            ListNode* slow = head;
            while(fast != NULL && fast->next != NULL) {
                slow = slow->next;
                fast = fast->next->next;
                // 快慢指针相遇，说明有环
                if (slow == fast) return true;
            }
            return false;
        }*/


    }

    //解法二：使用hashset
    public boolean hasCycle2(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if (head == null){
            return false;
        }
        ListNode temp = head;
        while (temp!=null){
            if(set.add(temp) == false){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}


