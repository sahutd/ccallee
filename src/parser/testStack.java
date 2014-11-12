package ccallee.parser;

import org.junit.*;
import static org.junit.Assert.*;


public class testStack
{
    private Stack<Character> myStack;

    @Before
    public void setUp()
    {
        myStack = new Stack<Character>();
    }

    @Test
    public void testPop()
    {
        myStack.push('a');
        myStack.push('b');
        assertEquals(myStack.pop().charValue(), 'b');
        assertEquals(myStack.pop().charValue(), 'a');
    }

    @Test
    public void testIsEmpty()
    {
        assertTrue(myStack.isEmpty());
        myStack.push('a');
        assertFalse(myStack.isEmpty());
    }
}
