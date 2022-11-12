package linkList;


import static linkList.Recursion.recursion;

/**
 * @author Breethy
 */
public class ReverseList {
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
