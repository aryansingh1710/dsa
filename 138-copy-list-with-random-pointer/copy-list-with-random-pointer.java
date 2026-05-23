class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) return null;

        Node head2 = new Node(0);

        Node temp1 = head;
        Node temp2 = head2;

        // creating deep copy
        while (temp1 != null) {

            Node a = new Node(temp1.val);

            temp2.next = a;
            temp2 = a;

            temp1 = temp1.next;
        }

        head2 = head2.next;

        temp1 = head;
        temp2 = head2;

        // alternate connection
        while (temp1 != null && temp2 != null) {

            Node next1 = temp1.next;
            Node next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }

        temp1 = head;

        // assigning random
        while (temp1 != null) {

            if (temp1.random == null)
                temp1.next.random = null;

            else
                temp1.next.random = temp1.random.next;

            temp1 = temp1.next.next;
        }

        // separating lists
        temp1 = head;
        temp2 = head2;

        while (temp1 != null && temp2 != null) {

            temp1.next = temp2.next;

            if (temp1.next != null)
                temp2.next = temp1.next.next;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return head2;
    }
}