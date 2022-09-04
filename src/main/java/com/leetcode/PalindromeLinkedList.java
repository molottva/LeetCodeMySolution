package com.leetcode;

import com.leetcode.helpers.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
        Example 1:
        Input: head = [1,2,2,1]
        Output: true

        Example 2:
        Input: head = [1,2]
        Output: false

        Constraints:
        The number of nodes in the list is in the range [1, 105].
        0 <= Node.val <= 9*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> tmp = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            tmp.add(currentNode.val);
            currentNode = currentNode.next;
        }

        for (int i = 0, j = tmp.size() - 1; i < j; i++, j--) {
            if (tmp.get(i) != tmp.get(j)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeTwo(ListNode head) {
        LinkedList<Integer> tmp = new LinkedList<Integer>();
        ListNode currentNode = head;
        while (currentNode != null) {
            tmp.add(currentNode.val);
            currentNode = currentNode.next;
        }

        while (tmp.peekFirst() != null) {
            if (tmp.peekFirst() != tmp.peekLast()) {
                return false;
            }
            tmp.pollFirst();
            tmp.pollLast();
        }
        return true;
    }
}
