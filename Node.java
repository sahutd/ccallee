public class Node<T>
{
    private final T key;
    private Node<T> next;

    public Node(T key)
    {
        this.key = key;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public Node<T> getNext()
    {
        return this.next;
    }

    public T getKey()
    {
        return this.key;
    }
}
