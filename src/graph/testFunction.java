package ccallee.graph;

import org.junit.*;
import static org.junit.Assert.*;

public class testFunction
{
    private Variable int_a;
    private Variable float_b;
    private Variable char_c;
    private argumentList<Variable> argList;
    private Function fn;

    @Before
    public void setUp()
    {
        int_a = new Variable("int", "a");
        float_b = new Variable("float", "b");
        char_c = new Variable("char", "c");

        argList = new argumentList<Variable>();
        argList.addVariable(int_a);
        argList.addVariable(float_b);
        argList.addVariable(char_c);
        fn = new Function("add", argList, "int");
    }

    @Test
    public void testSimpleFunctionToString()
    {
        assertEquals(fn.toString(), "int add(int a, float b, char c)");
    }
}
