public class SearchValueInList 
{
    static boolean searchValue(Node head, int target)
    {
        while (head != null)
        {
            if (head.data == target)
                return true;

            head = head.next;
        }

        return false;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 1);
        head = Node.insertAtEnd(head, 20);
        head = Node.insertAtEnd(head, 33);
        head = Node.insertAtEnd(head, 40);

        Node.printLinkedList(head);

        System.out.println(searchValue(head, 8));
        System.out.println(searchValue(head, 20));
    }
}
