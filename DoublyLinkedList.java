/* 
 * Write a java program for the following:
 * Create a doubly linked list of elements.
 * Delete a given element from the above list.
 * Display the contents of the list after deletion.
*/

public class DoublyLinkedList {
    Node head;
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null)
            head.prev = new_node;
        head = new_node;
    }
    void deleteNode(Node head_ref, Node del) {
        if (head == null || del == null)
            return;
        if (head == del)
            head = del.next;
        if (del.next != null)
            del.next.prev = del.prev;
        if (del.prev != null)
            del.prev.next = del.next;
        return;
    }
    void printList(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(2);
        dll.push(4);
        dll.push(8);
        dll.push(10);
        System.out.println("Created DLL is: ");
        dll.printList(dll.head);
        dll.deleteNode(dll.head, dll.head);
        System.out.println("DLL after deletion of first node: ");
        dll.printList(dll.head);
    }
}
