package ru.khananov;

public class PalindromeLinkedList {
  ListNode curr;
  public static void main(String[] args) {
    new PalindromeLinkedList().isPalindrome(
        new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))
    );
  }

  public boolean isPalindrome(ListNode head) {
    curr = head;
    return rec(head);
  }

  private boolean rec(ListNode head) {
    if (head == null) return true;
    boolean result = rec(head.next) && head.val == curr.val;
    curr = curr.next;
    return result;
  }
}
