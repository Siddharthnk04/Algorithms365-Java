public class AverageOfNodeValues 
{
    static double getAverageOfNodeValues(Node head)
    {
        if (head == null)
            return -1;

        double sum = 0.0;
        int count = 0;

        while (head != null)
        {
            sum += head.data;
            count++;
            head = head.next;
        }

        return sum / count;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 1);
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 32);
        head = Node.insertAtEnd(head, 40);

        Node.printLinkedList(head);

        System.out.println(getAverageOfNodeValues(head));
    }
}
