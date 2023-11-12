package ru.khananov;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        System.out.println(new ConvertBinaryNumberInALinkedListToInteger().getDecimalValue(new ListNode(
                1, new ListNode(
                0, new ListNode(
                0, new ListNode(
                1, new ListNode(
                0, new ListNode(
                0, new ListNode(
                1, new ListNode(
                1, new ListNode(
                1, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0)))))))))))))))));
    }

    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int decNum = 0;
        int powerOfNum = -1;

        while (temp != null) {
            powerOfNum++;
            temp = temp.next;
        }

        while (powerOfNum >= 0 && head != null) {
            decNum += (int) Math.pow(2, powerOfNum--) * head.val;
            head = head.next;
        }

        return decNum;
    }
}
