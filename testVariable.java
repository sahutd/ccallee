import org.junit.*;
import static org.junit.Assert.*;

public class testVariable
{

    @Test
    public void testVariableGetters()
    {
        Variable v = new Variable("int", "temp");
        assertEquals(v.getVarType(), "int");
        assertEquals(v.getVarName(), "temp");
    }
}
