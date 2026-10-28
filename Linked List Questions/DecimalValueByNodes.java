

public class DecimalValueByNodes 
{
    static int getDecimalValueBackwards(Node head)
    {
        if (head == null)
            return -1;

        int decimalValue = 0;
        int place = 1;

        while (head != null)
        {
            decimalValue += place * head.data;
            place *= 10;
            head = head.next;
        }

        return decimalValue;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 5);
        head = Node.insertAtEnd(head, 2);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 4);

        Node.printLinkedList(head);

        System.out.println(getDecimalValueBackwards(head));
    }
}
