public class ReplaceNegativeWithZero 
{
    static Node replaceNegativeWithZero(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            if(temp.data < 0)
                temp.data = 0;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 5);
        head = Node.insertAtEnd(head, -2);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, -8);

        Node.printLinkedList(head);

        head = replaceNegativeWithZero(head);
        Node.printLinkedList(head);
    }
}
