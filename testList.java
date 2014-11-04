import org.junit.*;
import static org.junit.Assert.*;

import java.util.Iterator;

public class testList
{
    private List<Integer> list;
    @Before
    public void setUp()
    {
        list = new List<Integer>();
    }

    @Test
    public void checkEmptyList()
    {
        assertEquals(list.head, null);
        assertEquals(list.tail, null);
    }

    @Test
    public void insertOnceIntoList()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        list.insertAtEnd(x);
        assertEquals(list.head, x);
        assertEquals(list.tail, x);
    }

    @Test
    public void insertMultipleIntoList()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        Node<Integer>y = new Node<Integer>(new Integer(10));
        Node<Integer>z = new Node<Integer>(new Integer(15));

        list.insertAtEnd(x);
        list.insertAtEnd(y);
        list.insertAtEnd(z);

        assertEquals(list.head, x);
        assertEquals(list.tail, z);

        assertEquals(x.getNext(), y);
        assertEquals(y.getNext(), z);

    }

    @Test
    public void testEmptyIterator()
    {
        Iterator<Integer> it = list.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        Node<Integer>y = new Node<Integer>(new Integer(10));
        Node<Integer>z = new Node<Integer>(new Integer(15));

        list.insertAtEnd(x);
        list.insertAtEnd(y);
        list.insertAtEnd(z);

        Iterator<Integer> it = list.iterator();

        assertTrue(it.hasNext());
        assertEquals(it.next(), (Integer)5);
        assertTrue(it.hasNext());
        assertEquals(it.next(), (Integer)10);
        assertTrue(it.hasNext());
        assertEquals(it.next(), (Integer)15);
        assertFalse(it.hasNext());
    }
}
