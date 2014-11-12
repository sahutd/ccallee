package ccallee.graph;
import java.util.Iterator;

public class List<T> implements Iterable<T>
{
    protected Node<T> head;
    protected Node<T> tail;

    public List()
    {
    }

    public Node<T> getHead()
    {
        return this.head;
    }

    public void insertAtHead(Node<T> temp)
    {
        if (head == null && tail == null)
        {
            head = tail = temp;
        }
        else
        {
            temp.setNext(head);
            head = temp;
        }
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

    public Node<T> deleteAtHead()
    {
        Node<T> temp = head;
        if (head == tail)
        {
            head = tail = null;
        }
        else
        {
            head = head.getNext();
        }
        return temp;
    }

    @Override
    public Iterator<T> iterator()
    {
        Iterator <T>it = new Iterator<T>()
        {
            private Node<T> current = head;

            @Override
            public boolean hasNext()
            {
                boolean result = true;
                if (current == null)
                {
                    result = false;
                }
                return result;
            }

            @Override
            public T next()
            {
                Node<T>temp = current;
                current = current.getNext();
                return temp.getKey();
            }
        };
        return it;
    }
}
