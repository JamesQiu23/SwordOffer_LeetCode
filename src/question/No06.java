package question;

/*输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。*/

import java.util.Stack;

public class No06 {

}

class Solution06 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        if (head == null){
            return new int[0];
        }
        else if(head.next == null){
            return new int[]{head.val};
        }
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null){
            stack.add(temp.val);
            temp = temp.next;
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}