package LAB_02;

class SinglyLinkedListStack {

    // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;

    // Push operation
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped element: " + top.data);
        top = top.next;
    }

    // Peek operation
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + top.data);
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class Q01 {
    public static void main(String[] args) {

        SinglyLinkedListStack stack = new SinglyLinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        stack.peek();
        stack.pop();
        stack.display();
    }
}
