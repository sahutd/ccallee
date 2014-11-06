import org.junit.*;
import static org.junit.Assert.*;

import java.util.Iterator;

public class testFunctionGraph
{
    private functionGraph fnGraph;
    private Variable tempVar;
    private argumentList<Variable> tempArgList;
    private Function tempFnA, tempFnB, tempFnC;

    @Before
    public void setUp()
    {
        fnGraph = new functionGraph();
        tempVar = new Variable("int", "temp");
        tempArgList = new argumentList<Variable>();
        tempArgList.addVariable(tempVar);

        tempFnA = new Function("a", tempArgList, "int");
        tempFnB = new Function("b", tempArgList, "int");
        tempFnC = new Function("c", tempArgList, "int");

        fnGraph.insert(tempFnA);
        fnGraph.insert(tempFnB);
        fnGraph.insert(tempFnC);
    }

    @Test
    public void testEmptyFunctionGraphGetNodes()
    {
        fnGraph = new functionGraph();
        Iterator<graphNode> it = fnGraph.getNodes();
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetNodes()
    {
        Iterator<graphNode> it = fnGraph.getNodes();

        assertTrue(it.hasNext());
        assertEquals(it.next().getKey(), tempFnA);
        assertTrue(it.hasNext());
        assertEquals(it.next().getKey(), tempFnB);
        assertTrue(it.hasNext());
        assertEquals(it.next().getKey(), tempFnC);
        assertFalse(it.hasNext());
    }
}
