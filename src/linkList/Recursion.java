package linkList;

/**
 * @author Breethy
 */
public class Recursion {

    //递归
    public static ListNode recursion(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
