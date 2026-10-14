public class SumOfAllNodes 
{
    static long calculateSumOfAllNodes(Node head)
    {
        if (head == null)
            return -1;

        long sum = 0;

        while (head != null)
        {
            sum += head.data;
            head = head.next;
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 80);
        head = Node.insertAtEnd(head, 5);
        head = Node.insertAtEnd(head, -78);
        head = Node.insertAtEnd(head, 56);

        Node.printLinkedList(head);

        System.out.println(calculateSumOfAllNodes(head));
    }
}
