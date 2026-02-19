package LAB_04;

public class Q02 {
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

    public static boolean isCyclic(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        //Case 1: No Cycle\
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        System.out.print("List 1: ");
        print(head1);
        System.out.println("Is Cyclic present : " + isCyclic(head1));


        //Case 2: With Cycle
        Node head2 = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head2.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;   // Creating cycle: last node points to second node

        System.out.println("\nList 2: ");
        System.out.println("Is Cyclic Present : " + isCyclic(head2));
    }

}
