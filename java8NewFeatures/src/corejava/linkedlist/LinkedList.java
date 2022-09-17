package corejava.linkedlist;

public class LinkedList {
    Node head; // the head of list

    /* Takes index as argument and return data at index */
    public int getNthElement(int index) {
        Node current = head;
        int count = 1; /* index of Node we are currently looking at */

        while(current != null) {
            if(count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }

        /* if we get to this line, the caller was asking for a non-existing element se we assert fail */
        assert (false);
        return 0;
    }

    /* Given a reference to the head of a list and an int, inserts a new Node on the front of the list */
    public void push(int newData) {
        /* 1. alloc the Node and put data */
        Node newNode = new Node(newData);

        /* 2. Make next of new Node as Head */
        newNode.next = head;

        /* 3. Move the head to point to new Node */
        head = newNode;
    }

}
