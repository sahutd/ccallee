package ccallee.graph;
import java.util.Iterator;

public interface IGraph
{
    public Iterator<graphNode> getNodes();
    public void insert(Function node);
}
