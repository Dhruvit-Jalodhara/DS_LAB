package LAB_04;

public class Q11 {
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
    public Node mergeKLists(Node[] lists) {
        if (lists == null || lists.length == 0) return null;

        Node result = null;

        for (Node list : lists) {
            result = mergeTwo(result, list);
        }

        return result;
    }
    public Node mergeTwo(Node temp1, Node temp2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.value <= temp2.value) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if(temp1!=null){
            temp.next = temp1;
        }else {
            temp.next = temp2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        Q11 obj = new Q11();

        // Create List 1: 1 -> 4 -> 7
        Node l1 = new Node(1);
        l1.next = new Node(4);
        l1.next.next = new Node(7);

        // Create List 2: 2 -> 5 -> 8
        Node l2 = new Node(2);
        l2.next = new Node(5);
        l2.next.next = new Node(8);

        // Create List 3: 3 -> 6 -> 9
        Node l3 = new Node(3);
        l3.next = new Node(6);
        l3.next.next = new Node(9);

        // Array of K lists
        Node[] lists = { l1, l2, l3 };

        // Merge K sorted lists
        Node mergedHead = obj.mergeKLists(lists);

        // Print result
        System.out.print("Merged List: ");
        print(mergedHead);
    }
}
