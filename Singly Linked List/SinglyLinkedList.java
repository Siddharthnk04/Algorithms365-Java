public class SinglyLinkedList 
{
    static Node createNode(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }
    
    public static void main(String[] args) 
    {
        //Creating first node
        Node newNode = new Node();
        newNode.data = 101;
        newNode.next = null;

        System.out.println(newNode); //Address 
        System.out.println(newNode.data); //101

        //Creating second node
        Node secondNode = new Node();
        secondNode.data = 102;
        secondNode.next = null;

        //Connecting first node to secondNode
        newNode.next = secondNode;

        System.out.println(secondNode.data); //102
        System.out.println(secondNode);
        System.out.println(newNode.next); //Address of secondNode
        System.out.println(newNode.next.data); //102

        //ThirdNode
        Node thirdNode = new Node();
        thirdNode.data = 103;
        thirdNode.next = null;

        newNode.next = thirdNode;
        secondNode.next = thirdNode;

        System.out.println(newNode.next.data);
        System.out.println(secondNode.next.data);

        //System.out.println(newNode.next.next.next); //Cannot read field "next" because "newNode.next.next" is null
        // Node head = createNode(10);
        // System.out.println(head.data);
        // System.out.println(head.next);

        // head.next = createNode(20);
        // System.out.println(head.next.data);
    }
}
