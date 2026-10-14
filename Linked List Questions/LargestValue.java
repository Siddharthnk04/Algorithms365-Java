public class LargestValue 
{
    static int getLargestValue(Node head)
    {
        if (head == null)
            return -1;  //Its not appropriate, as -1 can also be the largest value

        int largest = head.data;

        while (head != null)
        {
            if (head.data > largest)
                largest = head.data;

            head = head.next;
        }

        return largest;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 10);
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 30);
        head = Node.insertAtEnd(head, 40);

        Node.printLinkedList(head);
        System.out.println(getLargestValue(head));
    }
}
