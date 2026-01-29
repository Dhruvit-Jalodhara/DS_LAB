package LAB_03;

public class SinglyLinkedList {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    SinglyLinkedList() {
        this.head = null;
    }
    // Q1.1 : insert that value x at the beginning of the LinkedList and return the head of the modified Linked List.
    public Node insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Q1.2 : insert that value y at the end of the LinkedList and return the head of the modified Linked List.
    public Node insertLast(int value) {
        if (head == null)
            return insertFirst(value);
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }
    // Q1.3 : Insert the val data at the given position (1-based index) of the LinkedList and return the head of the modified  Linked List.
    public Node insert(int index, int value) {
        if (index == 0)
            return insertFirst(value);
        Node temp = head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    // Q2 : You are given the head of a singly linked list and an integer x. Delete the xth node (1-based indexing) from the singly linked list.
    public Node delete(int index){
        if(head == null || head.next == null) return null;
        Node temp = head;
        for (int i = 1; i < index - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }
    // Q3 : You are given the head of a singly linked list. You have to reverse the linked list and return the head of the reversed list.
    public Node reverse(){
        if(head == null) return null;
        Node prev = null , curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
