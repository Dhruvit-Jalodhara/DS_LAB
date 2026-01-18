package LAB_02;

import java.util.Scanner;

class SinglyLinkedListDigits {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at end
    void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Q02 {
    public static void main(String[] args) {

        SinglyLinkedListDigits list = new SinglyLinkedListDigits();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[20];
        int count = 0;

        while (num > 0) {
            digits[count++] = num % 10;
            num /= 10;
        }

        for (int i = count - 1; i >= 0; i--) {
            list.append(digits[i]);
        }

        System.out.println("Linked List of digits:");
        list.display();
    }
}
