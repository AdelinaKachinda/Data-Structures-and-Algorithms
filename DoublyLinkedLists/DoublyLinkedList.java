package DoublyLinkedLists;

import java.util.ArrayList;

public class DoublyLinkedList {

    Node head;
    Node tail;

    public void prepend(String data)
    {
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
            tail = newNode;

            return;
        }

        newNode.next = head;
        head.previous = newNode;
        head = newNode;

    }

    public void append(String data)
    {
        Node newNode = new Node(data);

        if (tail == null){
            head = newNode;
            tail = newNode;
        }

        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public ArrayList<String> printList()
	{
		ArrayList<String> myArray = new ArrayList<String>();

		Node current = head;

		while(current != null)
		{
			myArray.add(current.val);
			myArray.add("-->");
			current = current.next;
		}

		return myArray;
	}

    private class Node
    {
        private String val;
        private Node next;
        private Node previous;

        public Node(String val)
        {
            this.val = val;
            this.next = null;
            this.previous = null;

        }
    }
    
}
