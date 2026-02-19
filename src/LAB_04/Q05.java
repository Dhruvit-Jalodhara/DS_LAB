package LAB_04;

public class Q05 {
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
    public static int length(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node reverseListInGroup(Node head, int k){
        Node dummy = new Node(-1);   // Dummy node
        dummy.next = head;

        Node temp = dummy;          // Before current group
        while (length(temp.next) >= k) {
            Node prev = temp;
            Node curr = temp.next;

            // Reverse k nodes
            for (int i = 1; i <= k; i++) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node groupTail = temp.next; // Tail after reversal
            temp.next.next = curr;  // Connect remaining list
            temp.next = prev;       // Connect reversed group
            temp = groupTail;       // Move to next group
        }
        head = dummy.next;
        return head;          // New head
    }
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Original Linked List:");
        print(head);

        int k = 3; // group size
        head = reverseListInGroup(head, k);

        System.out.println("Linked List after reversing in groups of " + k + ":");
        print(head);
    }


}
