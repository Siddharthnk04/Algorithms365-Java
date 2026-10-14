public class Node
{
    public int data;
    public Node next;

    public static void printLinkedList(Node head)
    {
        System.out.print("head -> ");
            
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        
        System.out.print("null");
        System.out.println();
    }

    public static Node createNode(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        return newNode;
    }

    public static Node insertAtEnd(Node head, int data)
    {
        Node newNode = createNode(data);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }
}