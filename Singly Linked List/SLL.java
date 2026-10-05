public class SLL 
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

    static Node deleteKeyNode(int key, Node head)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!! Cannot delete.");
            return null;
        }

        while (head != null && head.data == key)
        {
            head = head.next;
        }

        Node keyNode = head;
        Node prev = null;

        while (keyNode != null)
        {
            if (keyNode.data == key)
            {
                prev.next = keyNode.next;
                keyNode = keyNode.next;
            }
            else
            {
                prev = keyNode;
                keyNode = keyNode.next;
            }
        }

        return head;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        // head = createNode(10);
        // head.next = createNode(20);
        // head.next.next = createNode(30);

        // printLinkedList(head);
        // head = insertAtEnd(85, head);
        // printLinkedList(head);
        
        // //Insert at begining
        // head = insertAtStart(25, head);
        // printLinkedList(head);

        // //Insert at end
        // insertAtEnd(100, head);
        // printLinkedList(head);

        // //Insert at middle
        // insertAfterValue(head, 25, 500);
        // printLinkedList(head);

        // head = inserstBeforeValue(head, 85, 250);
        // printLinkedList(head);

        printLinkedList(head);
        head = deleteAtStart(head);
        printLinkedList(head);

        head = insertAtEnd(20, head);
        printLinkedList(head);
        

        head = insertAtEnd(20, head);
        head = insertAtEnd(30, head);
        head = insertAtEnd(20, head);
        head = insertAtEnd(50, head);

        printLinkedList(head);
        // head = deleteAtStart(head);
        // printLinkedList(head);

        // head = deleteAtEnd(head);
        // printLinkedList(head);
        
        // head = deleteKeyNode(40, head);
        // printLinkedList(head);

        head = deleteKeyNode(200, head);
        printLinkedList(head);
    }
}