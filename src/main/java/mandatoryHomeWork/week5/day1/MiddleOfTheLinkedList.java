package mandatoryHomeWork.week5.day1;

import org.testng.annotations.Test;

import mandatoryHomeWork.linkedListImplementation.ListNode;
import mandatoryHomeWork.linkedListImplementation.SingleLinkedList;

public class MiddleOfTheLinkedList {
	
	@Test
	public void TC1() {
		int[] arr = {1,2,3,4,5};
		ListNode h = SingleLinkedList.create(arr);
		ListNode ans = middleNode(h);
		while(ans!=null) {
			System.out.println(ans.val);
			ans = ans.next;		
		}
}
	
	 public ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;

	        while(fast.next != null && fast.next.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        if(fast.next != null) slow = slow.next;

	        return slow;
	    }

}
