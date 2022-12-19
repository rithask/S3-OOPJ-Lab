/* 
 * Write a java program for the following:
 * Create a doubly linked list of elements.
 * Delete a given element from the above list.
 * Display the contents of the list after deletion.
 * 
 * ALGORITHM
 * 
 * Algorithm for push
 * 1. Create a new node.
 * 2. Set the data of the new node to the data passed as argument.
 * 3. Set the next of the new node to the head.
 * 4. Set the previous of the new node to null.
 * 5. If the head is not null, set the previous of the head to the new node.
 * 6. Set the head to the new node.
 * 7. Stop
 * 
 * Algorithm for deleting a node
 * 1. If the head is null or the node to be deleted is null, stop.
 * 2. If the head is the node to be deleted, set the head to the next of the head.
 * 3. Set the previous of the next of the node to be deleted to the previous of the node to be deleted.
 * 4. Set the next of the previous of the node to be deleted to the next of the node to be deleted.
 * 5. Stop
 * 
 * Algorithm for printing the list
 * 1. Create a node last and set it to null.
 * 2. Print "Traversal in forward direction".
 * 3. While the node is not null, print the data of the node.
 * 4. Set the last to the node.
 * 5. Set the node to the next of the node.
 * 6. Print a new line.
 * 7. Print "Traversal in reverse direction".
 * 8. While the last is not null, print the data of the last.
 * 9. Set the last to the previous of the last.
 * 10. Stop
 * 
 * Algorithm for main
 * 1. Create a doubly linked list.
 * 2. Create a scanner object.
 * 3. Display a menu
 * 4. Read the choice.
 * 5. If the choice is 1, read the data to be inserted.
 * 6. Call the push method of the doubly linked list object and pass the data to be inserted as argument.
 * 7. If the choice is 2, read the data to be deleted.
 * 8. Create a node temp and set it to the head.
 * 9. While the temp is not null, if the data of the temp is equal to the data to be deleted, call the deleteNode method of the doubly linked list object and pass the head and temp as arguments.
 * 10. Set the temp to the next of the temp.
 * 11. If the choice is 3, call the printList method of the doubly linked list object and pass the head as argument.
 * 12. If the choice is 4, stop.
 * 13. If the choice is not 1, 2, 3 or 4, display "Invalid choice".
 * 14. Stop
*/

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				System.out.println("Enter the element to be inserted:");
				int element = sc.nextInt();
				dll.push(element);
				dll.printList(dll.head);
				break;
			case 2:
				System.out.println("Enter the element to be deleted:");
				int del = sc.nextInt();
				dll.deleteNode(dll.head, dll.head.next);
				dll.printList(dll.head);
				break;
			case 3:
				dll.printList(dll.head);
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
