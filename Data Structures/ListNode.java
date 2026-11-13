public class ListNode 
{
    int data;
    ListNode next;

    public ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }

    public ListNode createListNode(int value)
    {
        return  new ListNode(value);
    }

    public void insertAtLast(int value, ListNode last)
    {
        last.next = createListNode(value);
    }

    
}
