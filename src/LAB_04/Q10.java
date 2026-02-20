package LAB_04;

public class Q10 {
    static class Node {
        int value;
        Node next, bottom;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.bottom = null;
        }
    }
    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.bottom;
        }
        System.out.println("null");
    }

    static Node merge(Node a, Node b) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.value <= b.value) {
                tail.bottom = a;
                a = a.bottom;
            } else {
                tail.bottom = b;
                b = b.bottom;
            }
            tail = tail.bottom;
            tail.next = null; // IMPORTANT
        }

        // Attach remaining nodes
        if (a != null)
            tail.bottom = a;
        else
            tail.bottom = b;

        return dummy.bottom;
    }

    static Node flatten(Node head) {

        if (head == null || head.next == null)
            return head;

        // Flatten remaining list
        head.next = flatten(head.next);

        // Merge current list with flattened next
        head = merge(head, head.next);

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next = new Node(10);
        head.next.bottom = new Node(20);

        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);

        head.next.next.next = new Node(28);
        head.next.next.next.bottom = new Node(35);
        head.next.next.next.bottom.bottom = new Node(40);
        head.next.next.next.bottom.bottom.bottom = new Node(45);

        // Flatten the list
        Node flatHead = flatten(head);

        // Print flattened list
        System.out.print("Flattened List: ");
        print(flatHead);
    }
}
