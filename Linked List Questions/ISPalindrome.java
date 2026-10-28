public class ISPalindrome 
{
    static boolean ispalindrome(Node head)
    {
        if (head == null)
            return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node prev = null;

        while (slow != null)
        {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        while (prev != null && head != null)
        {
            if (prev.data != head.data)
                return false;

            prev = prev.next;
            head = head.next;
        }

        return true;
    }


    public static void main(String[] args) 
    {
        Node head = null;
        head = Node.insertAtEnd(head, 5);
        head = Node.insertAtEnd(head, 2);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 3);
        head = Node.insertAtEnd(head, 2);
        head = Node.insertAtEnd(head, 5);


        Node.printLinkedList(head);

        System.out.println(ispalindrome(head));
    }
}


