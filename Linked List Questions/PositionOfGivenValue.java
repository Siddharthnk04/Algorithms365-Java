public class PositionOfGivenValue 
{
    static int findPositionOfGivenValue(Node head, int val)
    {
        int count = 0;

        while(head != null)
        {
            count++;

            if (head.data == val)
                return count;

            head = head.next;
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 7);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 9);
        head = Node.insertAtEnd(head, 3);

        Node.printLinkedList(head);

        System.out.println(findPositionOfGivenValue(head, 3));
    }
}
