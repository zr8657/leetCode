package leetCode;

//环形链表
public class L_141_LinkedListCycle {

	/**
	 * Definition for singly-linked list. class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; next = null; } }
	 */
	public boolean hasCycle(ListNode head) {
		ListNode ln1 = head;// ln1每次走 一步
		ListNode ln2 = head;// ln2每次走两步
		if (ln1 == null) { // 传入list可能为null
			return false;
		}

		while (true) {
			// ln2走一步判断是否为空，否则再走一步，再次判断是否为空
			ln2 = ln2.next;
			if (ln2 == null) {
				return false;
			}
			ln2 = ln2.next;
			if (ln2 == null) {
				return false;
			}
			// ln1走一步，如果相遇说明存在环
			ln1 = ln1.next;
			if (ln2 == ln1) {
				return true;
			}

		}
	}
}
