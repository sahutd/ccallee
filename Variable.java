public class Variable
{
    private final String varType;
    private final String varName;

    public Variable(String varType, String varName)
    {
        this.varType = varType;
        this.varName = varName;
    }

    public String getVarName()
    {
        return this.varName;
    }

    public String getVarType()
    {
        return this.varType;
    }
}
