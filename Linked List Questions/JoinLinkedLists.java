public class JoinLinkedLists 
{
    static Node attachSecondListAtEndOfFirst(Node head1, Node head2)
    {
        if (head1 == null)
            return head2;

        if (head2 == null)
            return head1;

        Node temp = head1;

        while (temp.next != null)
            temp = temp.next;

        temp.next = head2;
        return head1;
    }

    public static void main(String[] args) 
    {
        Node head1 = null;
        head1 = Node.insertAtEnd(head1, 5);
        head1 = Node.insertAtEnd(head1, 5);
        head1 = Node.insertAtEnd(head1, 3);
        Node.printLinkedList(head1);

        Node head2 = null;
        head2 = Node.insertAtEnd(head2, 8);
        head2 = Node.insertAtEnd(head2, 1);
        head2 = Node.insertAtEnd(head2, 2);
        Node.printLinkedList(head2);

        Node head = attachSecondListAtEndOfFirst(head1, head2);
        Node.printLinkedList(head);
    }
}
