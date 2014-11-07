package ccallee.graph;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Iterator;

public class testGraphNode
{
    private argumentList<Variable> args;
    private Function fn_a, fn_b, fn_c, fn_d;
    private graphNode a, b, c, d;

    @Before
    public void setUp()
    {
        args = new argumentList<Variable>();
        args.addVariable(new Variable("int", "a"));
        args.addVariable(new Variable("float", "b"));

        fn_a = new Function("a", args, "int");
        fn_b = new Function("b", args, "float");
        fn_c = new Function("c", args, "double");
        fn_d = new Function("d", args, "long");

        a = new graphNode(fn_a);
        b = new graphNode(fn_b);
        c = new graphNode(fn_c);
        d = new graphNode(fn_d);

    }

    @Test
    public void testIsolatedNode()
    {
        Iterator<graphNode> it = a.outEdgeIterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testSelfLoop()
    {
        a.addEdgeFrom(a);
        a.addEdgeTo(a);
        Iterator<graphNode> it = a.outEdgeIterator();

        assertTrue(it.hasNext());
        assertEquals(it.next(), a);
        assertFalse(it.hasNext());
    }

    @Test
    public void testSimpleGraph()
    {
        /**
        * Description of test structure
        *            inEdges              outEdges
        *  a          a,b,c                a,c
        *  b                               a,c
        *  c          a,b                  a
        *  d
        */
        a.addEdgeFrom(a);
        a.addEdgeFrom(b);
        a.addEdgeFrom(c);
        a.addEdgeTo(a);
        a.addEdgeTo(c);

        b.addEdgeTo(a);
        b.addEdgeTo(c);

        c.addEdgeFrom(a);
        c.addEdgeFrom(b);
        c.addEdgeTo(a);


        Iterator<graphNode> it_a = a.outEdgeIterator();
        assertEquals(it_a.next(), a);
        assertEquals(it_a.next(), c);
        assertFalse(it_a.hasNext());

        Iterator<graphNode> it_b = b.outEdgeIterator();
        assertEquals(it_b.next(), a);
        assertEquals(it_b.next(), c);
        assertFalse(it_b.hasNext());

        Iterator<graphNode> it_c = c.outEdgeIterator();
        assertEquals(it_c.next(), a);
        assertFalse(it_c.hasNext());

        Iterator<graphNode> it_d = d.outEdgeIterator();
        assertFalse(it_d.hasNext());
    }
}
