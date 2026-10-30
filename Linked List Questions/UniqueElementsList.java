public class UniqueElementsList 
{
    static Node createUniqueElementsList(Node head1, Node head2)
    {
        // Both lists are empty
        if (head1 == null && head2 == null)
            return null;

        Node result = null;

        // Selecting the head of resulting list
        if (head1 == null) //First list is empty
        {
            result = head2;
            head2 = head2.next;
        }
        else if (head2 == null)  // Second list is empty
        {
            result = head1;
            head1 = head1.next;
        }
        else   // Both list are non empty
        {
            if (head1.data < head2.data)
            {
                result = head1;
                head1 = head1.next;
            }
            else
            {
                result = head2;
                head2 = head2.next;
            }
        }

        Node curr = result;

        while (head1 != null && head2 != null)
        {
            // Current Value of first list is smaller
            if (head1.data < head2.data)
            {
                if (curr.data != head1.data)
                {
                    curr.next = head1;
                    curr = curr.next;
                }
                head1 = head1.next;
            }
            // Current Value of seconf list is smaller
            else if (head2.data < head1.data)
            {
                if (curr.data != head2.data)
                {
                    curr.next = head2;
                    curr = curr.next;
                }
                head2 = head2.next;
            }
            // Both list has same current values
            else
            {
                if (curr.data != head1.data)
                {
                    curr.next = head1;
                    curr = curr.next;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
        }

        // Process remaining nodes of first list
        while (head1 != null)
        {
            if (curr.data != head1.data)
            {
                curr.next = head1;
                curr = curr.next;
            }
            head1 = head1.next;
        }

        // Process remaining nodes of second list.
        while (head2 != null)
        {
            if (curr.data != head2.data)
            {
                curr.next = head2;
                curr = curr.next;
            }
            head2 = head2.next;
        }

        // Disconnecting any duplicate nodes skipped during traversal. 
        curr.next = null;

        return result;
    }
    public static void main(String[] args) 
    {
        Node head1 = null;
        head1 = Node.insertAtEnd(head1, 1);
        head1 = Node.insertAtEnd(head1, 1);
        
        Node.printLinkedList(head1);

        Node head2 = null;
        head2 = Node.insertAtEnd(head2, 1);
        head2 = Node.insertAtEnd(head2, 1);
        head2 = Node.insertAtEnd(head2, 1);
        
        Node.printLinkedList(head2);

        Node newList = createUniqueElementsList(head1, head2);
        Node.printLinkedList(newList);
    }
}
