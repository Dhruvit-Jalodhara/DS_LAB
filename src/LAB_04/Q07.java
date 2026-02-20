package LAB_04;

public class Q07 {
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
    static Node moveLastToFront(Node head) {
        if (head == null || head.next == null)
            return head;

        Node secondLast = head;

        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        Node last = secondLast.next;
        secondLast.next = null;

        last.next = head;
        head = last;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Original List: ");
        print(head);

        head = moveLastToFront(head);

        System.out.print("After Moving Last to Front: ");
        print(head);
    }
}
