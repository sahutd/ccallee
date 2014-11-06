import java.util.Iterator;

public class functionGraph implements IGraph
{
    private List<graphNode> nodeList;

    public functionGraph()
    {
        nodeList = new List<graphNode>();
    }

    public Iterator<graphNode> getNodes()
    {
        return nodeList.iterator();
    }

    public void insert(Function fn)
    {
        graphNode temp = new graphNode(fn);
        nodeList.insertAtEnd(new Node<graphNode>(temp));
    }
}
