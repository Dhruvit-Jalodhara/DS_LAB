package LAB_04;

public class Q04 {
     static class Node2 {
        int val;
        Node2 next;
        Node2 random;

        public Node2(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static void print(Node2 head){
        Node2 temp = head;
        while(temp != null){
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.print("(" + temp.val + ", random -> " + randomVal + ") ");
            temp = temp.next;
        }
        System.out.println();
    }


    public Node2 copyRandomList(Node2 head1) {
        if(head1 == null) return null;

        // step 1 : creating deep copy without random connecting
        Node2 head2 = deepCopy(head1);

        // step 2 : alternatively connecting the list
        merge(head1 , head2);

        // step 3 : connecting random connection
        randomConnections(head1 , head2);

        // step 4 : split lists
        split(head1 , head2);

        return head2;
    }

    public static Node2 deepCopy(Node2 head){
        Node2 dummy = new Node2(-1);
        Node2 temp1 = head;
        Node2 temp2 = dummy;
        while(temp1 != null){
            Node2 newNode = new Node2(temp1.val);
            temp2.next = newNode;
            temp2 = newNode;
            temp1 = temp1.next;
        }
        return dummy.next;
    }

    public static void merge(Node2 head1 , Node2 head2){
        Node2 dummy = new Node2(-1);
        Node2 temp = dummy;
        Node2 temp1 = head1;
        Node2 temp2 = head2;

        while(temp2 != null){
            temp.next =temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next =temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
    }

    public static void randomConnections(Node2 head1 ,Node2 head2){
        Node2 temp1 = head1;
        Node2 temp2 = head2;

        while(temp1 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;

            temp1 = temp1.next.next;
            if(temp2.next != null)temp2 = temp2.next.next;
        }
    }

    public static void split(Node2 head1 , Node2 head2){
        Node2 dummy1 = new Node2(-1);
        Node2 temp1 = dummy1;
        Node2 dummy2 = new Node2(-1);
        Node2 temp2 = dummy2;

        Node2 temp = head1;
        while(temp != null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;

            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
        temp2.next = null;

        head1 = dummy1.next;
        head2 = dummy2.next;
    }

    public static void main(String[] args) {

        Q04 obj = new Q04();

        // Creating original list
        Node2 n1 = new Node2(1);
        Node2 n2 = new Node2(2);
        Node2 n3 = new Node2(3);
        Node2 n4 = new Node2(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Setting random pointers
        n1.random = n3;  // 1 -> 3
        n2.random = n1;  // 2 -> 1
        n3.random = n3;  // 3 -> itself
        n4.random = n2;  // 4 -> 2

        System.out.println("Original List:");
        print(n1);

        // Deep copy
        Node2 copiedHead = obj.copyRandomList(n1);

        System.out.println("\nCopied List:");
        print(copiedHead);
    }

}
