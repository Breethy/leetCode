package linkList;

/**
 * @author Breethy
 */
public class Iterate {

    //迭代
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

}
