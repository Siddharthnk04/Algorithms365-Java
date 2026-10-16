public class InsertAtFront 
{
    static Node insertAtFront(Node head, int data)
    {
        Node newNode = Node.createNode(data);

        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 2);
        head = Node.insertAtEnd(head, 3);

        Node.printLinkedList(head);

        head = insertAtFront(head, 1);
        Node.printLinkedList(head);
    }
}
