public class Function
{
    private String name;
    private argumentList<Variable> argList;
    private String returnType;

    public Function(String name, argumentList<Variable> arglist,
                    String returnType)
    {
        this.name = name;
        this.argList = argList;
        this.returnType = returnType;
    }

    public String toString()
    {
        String repr;
        repr = returnType + " " + name + "(" + argList.toString() + ")";
        return repr;
    }
}
