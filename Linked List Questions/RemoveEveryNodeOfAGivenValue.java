public class RemoveEveryNodeOfAGivenValue 
{
    static Node removeEveryNodeOfAGivenValue(Node head, int val)
    {
        while (head != null && head.data == val)
            head = head.next;

        if (head == null)
            return null;

        Node temp = head;

        while (temp.next != null)
        {
            if (temp.next.data == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 1);
        head = Node.insertAtEnd(head, 7);
        head = Node.insertAtEnd(head, 2);
        head = Node.insertAtEnd(head, 7);

        Node.printLinkedList(head);

        head = removeEveryNodeOfAGivenValue(head, 7);
        Node.printLinkedList(head);
    }
}
