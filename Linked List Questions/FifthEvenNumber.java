public class FifthEvenNumber 
{
    static int getFifthEvenNumber(Node head, int n)
    {
        if (head == null)
            return -1;

        while (head != null)
        {
            if (head.data % 2 == 0 && --n == 0)
                    return head.data;
            head = head.next;
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 1);
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 33);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 80);
        head = Node.insertAtEnd(head, 40);
        head = Node.insertAtEnd(head, 70);
        head = Node.insertAtEnd(head, 31);
        head = Node.insertAtEnd(head, 87);
        head = Node.insertAtEnd(head, 40);
        head = Node.insertAtEnd(head, 80);

        Node.printLinkedList(head);

        System.out.println(getFifthEvenNumber(head, 4));
    }
}
