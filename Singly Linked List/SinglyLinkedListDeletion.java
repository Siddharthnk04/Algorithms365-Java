public class SinglyLinkedListDeletion 
{
    static Node createNode(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }

    static Node insertAtEnd(int data, Node head)
    {
        Node newNode = createNode(data);

        if (head == null)
        {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static void printLinkedList(Node head)
    {
        if (head == null)
        {
            System.out.println("head -> null");
            return;
        }

        Node temp = head;
        System.out.print("head -> ");

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
        System.out.println();
    }

    static Node deleteAtStart(Node head)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!! Cannot delete.");
            return null;
        }

        System.out.println("Deleted at Start");
        return head.next;
    }

    static Node deleteAtEnd(Node head)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!! Cannot delete.");
            return null;
        }
        if (head.next == null)
        {
            System.out.println("Deleted at End");
            return null;
        }

        Node temp = head;

        while (temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Deleted at End");
        return head;
    }

    static Node deleteValue(int value, Node head)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!! Cannot delete.");
            return null;
        }

        if (head.data == value)
        {
            System.out.println("Value " + value + ", Deleted");
            return head.next;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value)
        {
            temp = temp.next;
        }

        if (temp.next == null)
        {
            System.out.println("Value " + value + ", does not exist!!!");
            return head;
        }

        temp.next = temp.next.next;
        System.out.println("Value " + value + ", Deleted");
        return head;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = insertAtEnd(10, head);
        head = insertAtEnd(20, head);
        head = insertAtEnd(30, head);
        head = insertAtEnd(40, head);
        head = insertAtEnd(50, head);

        printLinkedList(head);
        head = deleteAtStart(head);
        printLinkedList(head);

        head = deleteAtEnd(head);
        printLinkedList(head);
        
        head = deleteValue(60, head);
        printLinkedList(head);
    }
}
