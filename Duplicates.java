public class Duplicates {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node deleteDuplicates(Node head) {
        Node temp = head;
        if (temp == null) {
            return head;
        }
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(1);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Duplicates duplicates = new Duplicates();
        Node result = duplicates.deleteDuplicates(a);


        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
