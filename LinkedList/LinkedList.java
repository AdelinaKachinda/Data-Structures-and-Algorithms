package LinkedList;

import java.util.ArrayList;

public class LinkedList
{
	Node head;

	public LinkedList()
	{
		head = new Node();

	}

	public void add(String data)
	{

        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        Node value = new Node(data);
        current.next = value;
        value.next = null;
	}

	public ArrayList<String> printInfo()
	{
		ArrayList<String> myArray = new ArrayList<String>();
		Node val = head;
		while(val.next != null)
		{
			myArray.add(val.data);
		}

		return myArray;
	}

	private class Node
	{
		String data;
        Node next;

		public Node(String data)
		{
			this.data = data;
			this.next = null;
		}

        public Node()
        {

        }

	}
}