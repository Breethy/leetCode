package linkList;


/**
 * @author Breethy
 */
public class ReverseList {
    static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode iterate(ListNode head){
        ListNode pre = null,next;
        ListNode curr = head;
        while (curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static ListNode recursion(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode fifthList = new ListNode(5,null);
        ListNode fourthList = new ListNode(4,fifthList);
        ListNode thirList = new ListNode(3,fourthList);
        ListNode secList = new ListNode(2,thirList);
        ListNode firList = new ListNode(1,secList);
//        ListNode curr = iterate(firList);
        ListNode curr = recursion(firList);
//        System.out.println(curr);
        System.out.println(curr);
    }
}
