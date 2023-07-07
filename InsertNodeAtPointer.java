public class InsertNodeAtPointer {
    public static class Node{
        int data;

        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static void insert(Node head, int idx,Node value)
    {
        Node temp = head;
        Node ans = new Node(value.data);
        for(int i=1; i<= idx-1 ; i++)
        {
            temp = temp.next;
        }
        ans.next = temp.next;
        temp.next = ans;
    }

    public static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();


    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node f = new Node(3);

        display(a);
        insert(a,2, f);
        display(a);
    }
}
