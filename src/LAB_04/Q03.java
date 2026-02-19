package LAB_04;

public class Q03 {
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

    public static Node removeDuplicate(Node head){
        Node i = head , j = head;
        while(j != null){
            if(i.value == j.value){
                j = j.next;
            }else{
                i.next = j;
                i = j;
            }
        }
        i.next = j;
        return head;
    }

    public static void main(String[] args) {

        // Creating sorted linked list with duplicates
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next = new Node(40);

        // Print original list
        System.out.print("Original List: ");
        print(head);

        // Remove duplicates
        head = removeDuplicate(head);

        // Print updated list
        System.out.print("After Removing Duplicates: ");
        print(head);
    }

}
