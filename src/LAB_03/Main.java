package LAB_03;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(20);
        list.insertFirst(10);
        list.display();
        list.insertLast(30);
        list.insertLast(40);
        list.display();
        list.insert(3,50);
        list.display();
        list.delete(3);
        list.display();
        list.reverse();
        list.display();
    }
}
