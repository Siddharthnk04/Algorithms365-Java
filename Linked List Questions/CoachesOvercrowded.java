public class CoachesOvercrowded 
{
    static int countOvercrowdedCoaches(Node head)
    {
        if (head == null)
            return -1;

        int count = 0;

        while (head != null)
        {
            if (head.data > 80)
                count++;

            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 72);
        head = Node.insertAtEnd(head, 95);
        head = Node.insertAtEnd(head, 80);
        head = Node.insertAtEnd(head, 110);

        Node.printLinkedList(head);

        System.out.println(countOvercrowdedCoaches(head));
    }
}
