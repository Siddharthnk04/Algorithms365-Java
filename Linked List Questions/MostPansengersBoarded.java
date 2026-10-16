public class MostPansengersBoarded 
{
    static int findStopWhereMostPassengersBoarded(Node head)
    {
        if (head == null)
            return -1;

        int mostPassengers = 0;
        int stop = 0;
        int count = 0;

        while (head != null)
        {
            count++;

            if (head.data > mostPassengers)
            {
                mostPassengers = head.data;
                stop = count;
            }

            head = head.next;
        }

        return stop;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 5);
        head = Node.insertAtEnd(head, 12);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 9);

        Node.printLinkedList(head);

        System.out.println(findStopWhereMostPassengersBoarded(head));
    }
}
