import java.util.Iterator;

public class argumentList<Variable> extends List<Variable>
{
    public argumentList()
    {
        super();
    }

    public void addVariable(Variable v)
    {
        Node<Variable> temp = new Node<Variable>(v);
        super.insertAtEnd(temp);
    }

    public String toString()
    {
        Iterator<Variable> it = this.iterator();
        String repr = "";
        while (it.hasNext())
        {
            repr = repr + it.next() + ", ";
        }
        try
        {
            // To remove the trailing ", " from the Variable
            // at the end.
            repr = repr.substring(0, repr.length() - 2);
        }
        catch (Exception e)
        {
            // If we are here, it means there were no arguments
            // in the argumentlist
            repr = repr;
        }
        return repr;
    }
}
