public class ListHoldingSumAtEachPosition 
{
    static Node getListHoldingSumAtEachPosition(Node head1, Node head2)
    {
        if (head1 == null || head2 == null)
            return null;

        Node head = null;
        
        while (head1 != null)
        {
            int sum = head1.data + head2.data;
            head = Node.insertAtEnd(head, sum);
            head1 = head1.next;
            head2 = head2.next;
        }

        return head;
    }

    public static void main(String[] args) 
    {
        Node head1 = null;
        head1 = Node.insertAtEnd(head1, 5);
        head1 = Node.insertAtEnd(head1, 5);
        head1 = Node.insertAtEnd(head1, 3);
        head1 = Node.insertAtEnd(head1, 8);
        Node.printLinkedList(head1);

        Node head2 = null;
        head2 = Node.insertAtEnd(head2, 8);
        head2 = Node.insertAtEnd(head2, 1);
        head2 = Node.insertAtEnd(head2, 2);
        head2 = Node.insertAtEnd(head2, -6);
        Node.printLinkedList(head2);

        Node head = getListHoldingSumAtEachPosition(head1, head2);
        Node.printLinkedList(head);
    }
}
