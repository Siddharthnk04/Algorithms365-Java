public class SameValuesInSameOrder 
{
    static boolean isSameValuesInSameOrder(Node head1, Node head2)
    {
        while (head1 != null && head2 != null)
        {
            if (head1.data != head2.data)
                return false;

            head1 = head1.next;
            head2 = head2.next;
        }

        return head1 == null && head2 == null;
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
        head2 = Node.insertAtEnd(head2, 5);
        head2 = Node.insertAtEnd(head2, 5);
        head2 = Node.insertAtEnd(head2, 3);
        head2 = Node.insertAtEnd(head2, 8);
        Node.printLinkedList(head2);

        System.out.println(isSameValuesInSameOrder(head1, head2));
    }
}
