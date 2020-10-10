package question;

// 面试题18（一）：在O(1)时间删除链表结点
// 题目：给定单向链表的头指针和一个结点指针，
// 定义一个函数在O(1)时间删除该结点。

public class No18_DeleteNodeInList {
    public static void main(String[] args) {

    }

    public void deleteNode(Node head, Node target){
        if(head == null || target == null){
            return;
        }
        else if(head.val == target.val){
            head = null;
        }
        Node temp = head;
        while (temp == null){
            if(head.nextNode.val == target.val){
                head.nextNode = head.nextNode.nextNode;
            }
        }
    }


}

class Node{
    int val;
    Node nextNode;
}
