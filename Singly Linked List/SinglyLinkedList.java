import java.util.Scanner;

public class SinglyLinkedList 
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

    static Node insertAfterValue(int data, int value, Node head)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!!");
            return null;
        }
        Node temp = head;
        while (temp != null && temp.data != value)
        {
            temp = temp.next;
        }

        if (temp == null)
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

    static void updateValue(int value, int newValue, Node head)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!!");
            return;
        }

        Node temp = head;

        while (temp != null)
        {
            if (temp.data == value)
            {
                System.out.println("Value Updated");
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value " + value + ", does not exist!");
    }

    static void searchValue(int value, Node head)
    {
        if (head == null)
        {
            System.out.println("List is Empty!!!");
            return;
        }

        Node temp = head;

        while (temp != null)
        {
            if (temp.data == value)
            {
                System.out.println(value + " is present in the Linked List.");
                return;
            }
            temp = temp.next;
        }

        System.out.println(value + " not found in the Linked List.");
    }

    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        int choice;
        do
        {
            System.out.println("   ===  Singly Linked List Operations  ===");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Update a node");
            System.out.println("4. Search a node");
            System.out.println("5. Print Linked List");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1 to 6) : ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1 : 
                    System.out.println("Choose Insertion Method : ");
                    System.out.println("1. Insert at Start");
                    System.out.println("2. Insert at End");
                    System.out.println("3. Insert after a value");
                    System.out.println("Enter your choice (1 to 3)");
                    int input = sc.nextInt();

                    System.out.print("Enter a data to insert : ");
                    switch (input)
                    {
                        case 1 :
                            head = insertAtStart(sc.nextInt(), head);
                            break;

                        case 2 :
                            head = insertAtEnd(sc.nextInt(), head);
                            break;

                        case 3 :
                            int data = sc.nextInt();
                            System.out.print("Enter a value after which you need to insert : ");
                            head = insertAfterValue(data, sc.nextInt(), head);
                            break;

                        default:
                            System.out.println("Invalid Choice !!!");
                    }
                    break;

                case 2 :
                    System.out.println("Choose Deletion Method : ");
                    System.out.println("1. Delete at Start");
                    System.out.println("2. Delete at End");
                    System.out.println("3. Delete a value");
                    System.out.println("Enter your choice (1 to 3)");
                    int input1 = sc.nextInt();

                    switch (input1)
                    {
                        case 1 :
                            head = deleteAtStart(head);
                            break;
                            
                        case 2 :
                            head = deleteAtEnd(head);
                            break;
                        
                        case 3 :
                            System.out.print("Enter a value to delete : ");
                            head = deleteValue(sc.nextInt(), head);
                            break;

                        default:
                            System.out.println("Invalid Choice !!!");
                    }
                    break;

                case 3 :
                    System.out.print("Enter a value to be updated : ");
                    int value = sc.nextInt();
                    System.out.print("Enter a new value : ");
                    updateValue(value, sc.nextInt(), head);
                    break;

                case 4 :
                    System.out.print("Enter a value to be searched : ");
                    searchValue(sc.nextInt(), head);
                    break;

                case 5 :
                    printLinkedList(head);
                    break;

                case 6 : 
                    System.out.println("Thank You !!!!!");
                    break;

                default:
                    System.out.println("Invalid Choice !!! ");
            }
        } while (choice != 6);
    }
}
