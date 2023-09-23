package ru.khananov;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode();
        ListNode currentList = resultHead;
        int tens = 0;

        while (l1 != null || l2 != null || tens != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + tens;
            tens = sum / 10;

            currentList.next = new ListNode(sum % 10);
            currentList = currentList.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return resultHead.next;
    }
}