/* 
 * Write a java program for the following:
 * Create a doubly linked list of elements.
 * Delete a given element from the above list.
 * Display the contents of the list after deletion.
 * 
 * ALGORITHM
 * 
 * 1. Start
 * 2. Create a doubly linked list.
 * 3. Create a scanner object.
 * 4. Repeat the following steps until the user enters 4.
 * 5. Display a menu
 * 6. Read the choice
 * 7. If the choice is 1, insert an element.
 * 8. Else if the choice is 2, delete an element.
 * 9. Else if the choice is 3, display the list.
 * 10. Else if the choice is 4, exit.
 * 11. Else, display "Invalid choice".
 * 12. Stop
 * 
 * Algorithm for insert
 * 1. Start
 * 2. Create a node new_node and set it to the new node.
 * 3. If the head is null, set the head to the new_node.
 * 4. Else, set the temp to the head.
 * 5. While the next of the temp is not null, set the temp to the next of the temp.
 * 6. Set the next of the temp to the new_node.
 * 7. Set the previous of the new_node to the temp.
 * 8. Stop
 * 
 * Algorithm for deleting a node
 * 1. Start
 * 2. If the head is null, display "List is empty".
 * 3. Else, set the temp to the head.
 * 4. While the data of the temp is not equal to the data to be deleted,
 * 		set the temp to the next of the temp.
 * 5. If the previous of the temp is not null,
 * 		set the next of the previous of the temp
 * 		to the next of the temp.
 * 6. If the next of the temp is not null,
 * 		set the previous of the next of the temp
 * 		to the previous of the temp.
 * 7. If the temp is equal to the head,
 * 		set the head to the next of the head.
 * 8. Stop
 * 
 * Algorithm for printing the list
 * 1. Start
 * 2. If the head is null, display "List is empty".
 * 3. Else, set the temp to the head.
 * 4. While the temp is not null, display the data of the temp.
 * 5. Set the temp to the next of the temp.
 * 6. Stop
 */

import java.util.Scanner;

public class DoublyLinkedList {
	Node head;

	class Node {
		private int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	public void insert(int data) {
		Node new_node = new Node(data);
		if (head == null)
			head = new_node;
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = new_node;
			new_node.prev = temp;
		}
	}

	void delete(int data) {
		if (head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;

			while (temp.data != data)
				temp = temp.next;

			if (temp.prev != null)
				temp.prev.next = temp.next;
			if (temp.next != null)
				temp.next.prev = temp.prev;
			
			if (temp == head)
				head = temp.next;

			temp = null;
		}
	}

	void display() {
		if (head == null)
			System.out.println("List is empty");
		else {
			System.out.print("List: ");
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n1. Insert\n2. Delete");
			System.out.println("3. Display\n4. Exit");
			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			System.out.println();
			switch (choice) {
				case 1:
					System.out.print("Enter the element to be inserted: ");
					int element = sc.nextInt();
					dll.insert(element);
					dll.display();
					break;
				case 2:
					System.out.print("Enter an element to be deleted: ");
					int element1 = sc.nextInt();
					dll.delete(element1);
					dll.display();
					break;
				case 3:
					dll.display();
					break;
				case 4:
					System.out.println("Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
