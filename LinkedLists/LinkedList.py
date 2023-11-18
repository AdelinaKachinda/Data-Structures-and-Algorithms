class Node:
    
     def __init__(self, val):
        self.val = val
        self.next = None
        self.prev = None


class LinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
    
    def addElement(self, val):

        value = Node(val)
        if self.head == None:
            self.head = value      
        else:
            curr = self.head
            while curr.next is not None:
                curr = curr.next
            curr.next = value
        
    def deleteElement(self, val):
        value = Node(val)
        curr = self.head
          
        while curr is not None:
            if curr.val == value:
                curr = curr.next
            

    
    


    
    def printList(self):
        string = ""
        curr = self.head
        while curr is not None:
            string += str(curr.val) + " --> "
            curr = curr.next
        print(string)
     

myLinkedList = LinkedList()
myLinkedList.addElement(6)
myLinkedList.addElement(7)
myLinkedList.addElement(8)
myLinkedList.addElement(9)
myLinkedList.addElement(10)
myLinkedList.printList()
print()
myLinkedList.deleteElement(8)
myLinkedList.printList()
            
            