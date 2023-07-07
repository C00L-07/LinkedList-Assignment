public class Palindrome {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode nextNode = null;
        ListNode current = head;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedSecondHalf = reverse(slow.next);
        ListNode p1 = head;
        ListNode p2 = reversedSecondHalf;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();


        ListNode a = palindrome.new ListNode(1);
        ListNode b = palindrome.new ListNode(2);
        ListNode c = palindrome.new ListNode(2);
        ListNode d = palindrome.new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;


        boolean isPalindrome = palindrome.isPalindrome(a);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
