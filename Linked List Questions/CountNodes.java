public class CountNodes 
{
    static int countNodes(Node head)
    {
        int count = 0;

        while (head != null)
        {
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 10);
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 30);
        head = Node.insertAtEnd(head, 40);

        Node.printLinkedList(head);
        System.out.println(countNodes(head));
        Node.printLinkedList(head);
    }
}
