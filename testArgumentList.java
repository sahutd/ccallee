import org.junit.*;
import static org.junit.Assert.*;

public class testArgumentList
{
    argumentList<Variable> argList;

    @Before
    public void setUp()
    {
        argList = new argumentList<Variable>();
    }

    @Test
    public void testNoVariable()
    {
        assertEquals(argList.toString(), "");
    }

    @Test
    public void testSingleVariable()
    {
        Variable int_a = new Variable("int", "a");
        argList.addVariable(int_a);
        assertEquals(argList.toString(), "int a");
    }

    @Test
    public void testMultipleVariables()
    {
        Variable int_a = new Variable("int", "a");
        Variable float_b = new Variable("float", "b");
        argList.addVariable(int_a);
        argList.addVariable(float_b);

        assertEquals(argList.toString(), "int a, float b");
    }
}
