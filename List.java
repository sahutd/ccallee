public class List<T>
{
    Node<T> head;
    Node<T> tail;

    public List()
    {
    }

    public void insertAtEnd(Node<T> temp)
    {
        if (head == null && tail == null)
        {
            head = tail = temp;
        }
        else
        {
            tail.setNext(temp);
            tail = temp;
        }
    }
}
