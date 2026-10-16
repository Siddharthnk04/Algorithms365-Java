public class EvenValueNodes 
{
    static int countEvenValueNodes(Node head)
    {
        if (head == null)
            return -1;

        int count = 0;

        while (head != null)
        {
            if ((head.data & 1) == 0)
                count++;

            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 1);
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 33);
        head = Node.insertAtEnd(head, 40);

        Node.printLinkedList(head);

        System.out.println(countEvenValueNodes(head));
    }
}
