package LAB_04;

public class Q08 {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static Node mergeSortedLists(Node head1, Node head2) {

        // Dummy node
        Node dummy = new Node(-1);
        Node tail = dummy;

        // Merge while both lists have nodes
        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (head1 != null)
            tail.next = head1;
        else
            tail.next = head2;

        // Actual head is next of dummy
        return dummy.next;
    }
    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.print("List 1: ");
        print(head1);

        System.out.print("List 2: ");
        print(head2);

        Node mergedHead = mergeSortedLists(head1, head2);

        System.out.print("Merged List: ");
        print(mergedHead);
    }
}
