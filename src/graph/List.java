package ccallee.graph;
import java.util.Iterator;

public class List<T> implements Iterable<T>
{
    protected Node<T> head;
    protected Node<T> tail;

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
