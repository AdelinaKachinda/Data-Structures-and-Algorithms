package DoublyLinkedLists;

public class Driver {
    
    public static void main(String[] args)
	{
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.prepend("5");
		linkedList.prepend("4");
		linkedList.append("3");
		linkedList.append("6");
		linkedList.prepend("1");
		linkedList.append("0");
        // output = 1, 4, 5, 3, 6,  0


		// linkedList.delete("3");

		System.out.println(linkedList.printList());
		

	}
}
