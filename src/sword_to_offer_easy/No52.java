package sword_to_offer_easy;

import java.util.HashSet;

/*题目：
* 输入两个链表，找出它们的第一个公共节点
*/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}



public class No52 {
    //解法1：使用set筛重
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }

        ListNode temp2 = headB;
        while (temp2 != null){
            /*if (set.add(temp2)){  //不应该使用添加的方法，有自己在集合中判断某个元素是否存在的方法
                temp2 = temp2.next;
            }else{
                break;
            }*/
            if(set.contains(temp2)){
                break;
            }else{
                temp2 = temp2.next;
            }
        }
        return temp2;
    }


    //解法2：使用双指针
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2){
        //没有必要避开同时为null导致while判断相等的情况，同时为null，说明等长，等长却相等为null，说明没有交点
            if (temp1 == null){
                temp1 = headB;
            }else{
                temp1 = temp1.next;
            }

            if (temp2 == null){
                temp2 = headA;
            }else{
                temp2 = temp2.next;
            }
        }

        return temp1;
    }
}























