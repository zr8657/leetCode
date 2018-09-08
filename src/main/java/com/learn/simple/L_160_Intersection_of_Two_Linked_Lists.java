package com.learn.simple;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class L_160_Intersection_of_Two_Linked_Lists {

}

// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
// if (headA == null || headB == null) {
// return null;
// }
//
// int i = 0, j = 0;
// i = length(headA);
// j = length(headB);
//
// while (i > j) {
// headA = headA.next;
// i--;
// }
// while (i < j) {
// headB = headB.next;
// j--;
// }
// while (headB != headA) {
// headA = headA.next;
// headB = headB.next;
// if (headA == null) {
// return null;
// }
// }
// return headA;
//
// }
//
// private int length(ListNode node) {
// int length = 0;
// while (node != null) {
// node = node.next;
// length++;
// }
// return length;
// }