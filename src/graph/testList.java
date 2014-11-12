package ccallee.graph;

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
    public void testEmptyList()
    {
        assertEquals(list.head, null);
        assertEquals(list.tail, null);
    }

    @Test
    public void testGetHead()
    {
        assertEquals(list.getHead(), null);
        Node<Integer>x = new Node<Integer>(new Integer(5));
    }

    @Test
    public void testInsertOnceIntoListAtHead()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        list.insertAtHead(x);
        assertEquals(list.head, x);
        assertEquals(list.tail, x);
    }

    @Test
    public void testInsertMultipleIntoListAtHead()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        Node<Integer>y = new Node<Integer>(new Integer(10));
        Node<Integer>z = new Node<Integer>(new Integer(15));

        list.insertAtHead(x);
        list.insertAtHead(y);
        list.insertAtHead(z);

        assertEquals(list.head, z);
        assertEquals(list.tail, x);

        assertEquals(z.getNext(), y);
        assertEquals(y.getNext(), x);
    }

    @Test
    public void testInsertOnceIntoListAtEnd()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        list.insertAtEnd(x);
        assertEquals(list.head, x);
        assertEquals(list.tail, x);
    }

    @Test
    public void testInsertMultipleIntoListAtEnd()
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
    public void testDeleteAtHeadSingleElementList()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        list.insertAtHead(x);
        assertEquals(list.deleteAtHead(), x);
        assertEquals(list.head, null);
        assertEquals(list.tail, null);
    }

    @Test
    public void testDeleteAtHeadMultipleElementList()
    {
        Node<Integer>x = new Node<Integer>(new Integer(5));
        Node<Integer>y = new Node<Integer>(new Integer(10));
        Node<Integer>z = new Node<Integer>(new Integer(15));

        list.insertAtEnd(x);
        list.insertAtEnd(y);
        list.insertAtEnd(z);

        assertEquals(list.deleteAtHead(), x);
        assertEquals(list.deleteAtHead(), y);
        assertEquals(list.deleteAtHead(), z);
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
