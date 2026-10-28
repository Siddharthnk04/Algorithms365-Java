public class UniqueElements 
{
    static Node createUniqueElementsList(Node head1, Node head2)
    {
        if (head1 == null && head2 == null)
            return null;

        Node result = null;
        Node lastNode = null;
        int lastData = 0;
        boolean isFirst = true;

        while (head1 != null && head2 != null)
        {
            if (isFirst)
            {
                if (head1.data < head2.data)
                {
                    result = Node.insertAtEnd(result, head1.data);
                    lastData = head1.data;
                    head1 = head1.next;
                }
                else
                {
                    result = Node.insertAtEnd(result, head2.data);
                    lastData = head2.data;
                    head2 = head2.next;
                }
                isFirst = false;
                lastNode = result;
                continue;
            }
            if (head1.data < head2.data)
            {
                if (head1.data != lastData)
                {
                    lastNode.next = Node.createNode(head1.data);
                    lastNode = lastNode.next;
                    lastData = head1.data;
                }
                head1 = head1.next;
            }
            else 
            {
                if (head2.data != lastData)
                {
                    lastNode.next = Node.createNode(head2.data);
                    lastNode = lastNode.next;
                    lastData = head2.data;
                }    
                head2 = head2.next;
            }
        }

        while (head1 != null)
        {
            if (isFirst)
            {
                result = Node.insertAtEnd(result, head1.data);
                lastData = head1.data;
                lastNode = result;
                isFirst = false;
            }
            else if (head1.data != lastData)
            {
                lastNode.next = Node.createNode(head1.data);
                lastNode = lastNode.next;
                lastData = head1.data;
            }
            head1 = head1.next;
        }

        while (head2 != null)
        {
            if (isFirst)
            {
                result = Node.insertAtEnd(result, head2.data);
                lastData = head2.data;
                lastNode = result;
                isFirst = false;
            }
            else if (head2.data != lastData)
            {
                lastNode.next = Node.createNode(head2.data);
                lastNode = lastNode.next;
                lastData = head2.data;
            }    
            head2 = head2.next;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        Node head1 = null;
        head1 = Node.insertAtEnd(head1, 1);
        head1 = Node.insertAtEnd(head1, 2);
        head1 = Node.insertAtEnd(head1, 3);
        head1 = Node.insertAtEnd(head1, 8);
        Node.printLinkedList(head1);

        Node head2 = null;
        head2 = Node.insertAtEnd(head2, 2);
        head2 = Node.insertAtEnd(head2, 5);
        head2 = Node.insertAtEnd(head2, 6);
        head2 = Node.insertAtEnd(head2, 8);
        head2 = Node.insertAtEnd(head2, 9);
        Node.printLinkedList(head2);

        Node newList = createUniqueElementsList(head1, head2);
        Node.printLinkedList(newList);
    }
}
