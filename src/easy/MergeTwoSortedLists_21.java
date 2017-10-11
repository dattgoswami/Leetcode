package easy;

public class MergeTwoSortedLists_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/*	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode lastNode = head;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                lastNode.next = l1;
                l1 = l1.next;
            } else {
                lastNode.next = l2;
                l2 = l2.next;
            }
            lastNode = lastNode.next;
        }
        
        if (l1 != null) {
            lastNode.next = l1;
        } else {
            lastNode.next = l2;
        }
        
        return head.next;
	}
*/
}
