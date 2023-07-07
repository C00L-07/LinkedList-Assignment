public class CheckValue {
    public static class Node{
        int data;

        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static boolean check(Node head,int target)
    {
        Node temp = head;

        while(temp!=null)
        {
            if(temp.data == target) return true;

            temp = temp.next;
        }
        return false;
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int target = 4;

        boolean ans = check(a,target);
        System.out.println(ans);



    }
}
