package corejava.linkedlist;

/**
 * Algorithm to find the Nth node from the end (using the length of the linked list)
 * 1. Initialize count = 1
 * 2. Loop through the link list
 *      a. if the count is equal to the passed index then return the current
 *          node
 *      b. Increment count
 *      c. change current to point to next of the current.
*/
public class FindNthElementInLinkedList {
    public static void main(String[] args) {
//        LinkedList= {1,2,3,4,5,6,7,8,9,10}  k=2  o/p : 9
//        LinkedList= {18,-27,3,4,5,6,7,10,9,12}  k=5  o/p : 6
//        LinkedList= {1}     k=1 o/p : 1
        int k = 2;
        LinkedList list = testCase1();
        System.out.println("Element at index " + k + " is " + list.getNthElement(k));

        k = 5;
        list = testCase2();
        System.out.println("Element at index " + k + " is " + list.getNthElement(k));

        k = 1;
        list = testCase3();
        System.out.println("Element at index " + k + " is " + list.getNthElement(k));
    }

    private static LinkedList testCase1() {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);
        list.push(10);
        return list;
    }

    private static LinkedList testCase2() {
        LinkedList list = new LinkedList();
        list.push(18);
        list.push(-27);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(10);
        list.push(9);
        list.push(12);
        return list;
    }

    private static LinkedList testCase3() {
        LinkedList list = new LinkedList();
        list.push(1);
        return list;
    }
}
