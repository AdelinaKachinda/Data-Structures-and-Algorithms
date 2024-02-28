package LinkedLists;

public class Driver
{
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.add("5");
		linkedList.add("4");
		linkedList.add("3");
		linkedList.add("6");
		linkedList.add("1");
		linkedList.prepend("0");

		linkedList.delete("3");

		System.out.println(linkedList.printList());
		

	}
}
