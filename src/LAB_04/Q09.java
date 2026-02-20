package LAB_04;

public class Q09 {
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
    public Node getIntersectionNode(Node headA, Node headB) {
        Node temp1 = headA , temp2 = headB;

        int len1 = 0;
        while(temp1 != null){
            len1++;
            temp1 = temp1.next;
        }

        int len2 = 0;
        while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;
        if(len1 > len2){
            for (int i = 1; i <= len1 - len2; i++)
                temp1 = temp1.next;
        }else{
            for (int i = 1; i <= len2 - len1; i++)
                temp2 = temp2.next;
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }
    public static void main(String[] args) {

        Q09 obj = new Q09();

        // Common part (intersection)
        Node common = new Node(4);
        common.next = new Node(5);

        // First list: 1 -> 2 -> 3 -> 4 -> 5
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common;

        // Second list: 9 -> 4 -> 5
        Node headB = new Node(9);
        headB.next = common;

        System.out.print("List A: ");
        print(headA);

        System.out.print("List B: ");
        print(headB);

        Node intersection = obj.getIntersectionNode(headA, headB);

        if (intersection != null)
            System.out.println("Intersection at node with value: " + intersection.value);
        else
            System.out.println("No intersection");
    }
}
