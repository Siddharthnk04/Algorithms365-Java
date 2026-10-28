public class MiddleOfLinkedList 
{
    static int getMiddleNode (Node head)
    {
        if (head == null)
            return -1;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 1);
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 33);
        head = Node.insertAtEnd(head, 40);
        head = Node.insertAtEnd(head, 80);

        Node.printLinkedList(head);

        System.out.println(getMiddleNode(head));
    }
}
