package ru.khananov;

public class LinkedListCycle {
  public static void main(String[] args) {

  }

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    if (head == null) return true;
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
      if (slow != fast) {
        slow = slow.next;
        fast = fast.next.next;
      } else {
        return true;
      }
    }
    return false;
  }
}
