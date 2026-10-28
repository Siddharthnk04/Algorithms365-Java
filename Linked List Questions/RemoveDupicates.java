public class RemoveDupicates 
{
    static void removeDupicates(Node head)
    {
        if (head == null)
            return;

        Node curr = head.next;

        while (curr != null)
        {
            if (curr.data == head.data)
            {
                curr = curr.next;
                head.next = curr;
            }
            else
            {
                head = head.next;
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 1);
        head = Node.insertAtEnd(head, 2);
        head = Node.insertAtEnd(head, 2);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 4);

        Node.printLinkedList(head);

        removeDupicates(head);
        Node.printLinkedList(head);
    }
}
