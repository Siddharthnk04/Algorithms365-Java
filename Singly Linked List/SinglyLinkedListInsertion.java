public class SinglyLinkedListInsertion 
{
    static Node createNode(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
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

    static Node insertAtStart(int data, Node head)
    {
        Node newNode = createNode(data);
        newNode.next = head;
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

    static void insertAfterValue(Node head, int value, int data)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!!");
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != value)
        {
            temp = temp.next;
        }

        if (temp == null)
        {
            System.out.println("Value " + value + ", does not exist!!!");
            return;
        }

        Node newNode = createNode(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static Node inserstBeforeValue(Node head, int value, int data)
    {
        if (head == null)
        {
            return null;
        }

        if (head.data == value)
        {
            return insertAtStart(data, head);
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

        Node newNode = createNode(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        // head = createNode(10);
        // head.next = createNode(20);
        // head.next.next = createNode(30);

        printLinkedList(head);
        head = insertAtEnd(85, head);
        printLinkedList(head);
        
        //Insert at begining
        head = insertAtStart(25, head);
        printLinkedList(head);

        //Insert at end
        insertAtEnd(100, head);
        printLinkedList(head);

        //Insert at middle
        insertAfterValue(head, 25, 500);
        printLinkedList(head);

        head = inserstBeforeValue(head, 85, 250);
        printLinkedList(head);
    }
}
