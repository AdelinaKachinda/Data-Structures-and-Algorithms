package LinkedLists;
import java.util.ArrayList;


public class LinkedList
{
	Node head;

	public LinkedList()
	{

	}

	public void prepend(String data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	public void add(String data)
	{
		/* if its null we add it and start from there. 
 		   If not null we loop till we get null and add */

 		   Node val = new Node(data);
 		   Node current = head;

 		   if (current == null)
 		   {
 		   	head = val;

 		   } else {

 		   	while (current.next != null)
 		   	{
 		   		current = current.next;
 		   	}
 		   	current.next = val;

 		   }

	}

	public void delete(String value)
	{

		// Code on board
		for (Node current = head; current.next != null; current = current.next)
		{
			if (current.next.data.equals(value))
			{
				current.next = current.next.next;
			}
		}

		// My code
		// for (Node current = head; current != null; current = current.next)
		// {
		// 	if (current.data.equals(value))
		// 	{
		// 		current.next = current.next.next;
		// 	}
		// }
	}

	public ArrayList<String> printList()
	{
		ArrayList<String> myArray = new ArrayList<String>();

		Node current = head;

		while(current != null)
		{
			myArray.add(current.data);
			myArray.add("-->");
			current = current.next;
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

	}

}
